package com.Google;

class StudentScore {
    private String stuID;
    private double score;

    StudentScore(String stuID, double score){
        this.stuID = stuID;
        this.score = score;
    }

    String getStuid(){
        return stuID;
    }

    double getScore() {
        return score;
    }
}