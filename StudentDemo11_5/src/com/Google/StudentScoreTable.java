package com.Google;

import java.util.ArrayList;

class StudentScoreTable {
    ArrayList<StudentScore> arr;

    StudentScoreTable() {
        arr = new ArrayList<StudentScore>();
    }

    public void add(StudentScore score) {
        arr.add(score);
    }

    public StudentScore findByStuID(String stuID) {
        int i = 0;
        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i).getStuid().equals(stuID)) {
                return arr.get(i);
            }
        }
        return null;
    }
}