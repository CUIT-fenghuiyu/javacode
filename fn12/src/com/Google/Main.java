package com.Google;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //����Ҫ��ȡ��Ŀ���ļ���
        String fileName = scanner.next(); 
            //��ȡ��Ŀ¼
            File base = new File(Objects.requireNonNull(Main.class.getResource("")).getPath()).getParentFile();
            //��������ļ���ʵ����File�����
       File file = new File(base+File.separator+fileName);
            //���ļ��ж�ȡ���ݣ������ذ������ݵ�List����
        List<Integer> data = readFromFile(file);
            //��������а�����int���ݵ�����
        System.out.println(data.size());
    }
    //�����ӿ�����
 public static List<Integer> readFromFile(File file){
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	try {
    	InputStream s = new FileInputStream(file);
    	int size = s.available()
	    	for(int i=0; i < size;i++) {
	    		list.add(s.read());
	    	}

    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    	return list;
 }
 
}
