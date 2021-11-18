package com.Google;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //输入要读取的目标文件名
        String fileName = scanner.next(); 
            //获取根目录
            File base = new File(Objects.requireNonNull(Main.class.getResource("")).getPath()).getParentFile();
            //用输入的文件名实例化File类对象
       File file = new File(base+File.separator+fileName);
            //从文件中读取数据，并返回包含数据的List集合
        List<Integer> data = readFromFile(file);
            //输出集合中包含的int数据的数量
        System.out.println(data.size());
    }
    //方法接口声明
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
