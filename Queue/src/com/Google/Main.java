package com.Google;
import java.util.Scanner;
//�ඨ��������ඨ��Ĵ��������Ĵ𰸡�

//�����ǲ��Դ��룬����д����Ĵ��У�
public class Main {
 public static void main(String[] args) {
     Queue queue = new Queue();
     Scanner scanner = new Scanner(System.in);

     for (int i = 0; i < 5; i++) {
         queue.offer(scanner.next());
     }

     for (int i = 0; i < 5; i++) {
         System.out.println("--------------------------------");
         System.out.printf("Size of queue is %d, the first element is:%s\n", queue.getSize(), queue.peek());
         System.out.printf("Pull element:%s\n", queue.pull());
         System.out.println(queue.empty() ? "Queue is empty!" : "Queue is not empty!");
     }

     System.out.println("**********************");
     if (queue.peek() == null)
         System.out.println("peek return null!");
     if (queue.pull() == null)
         System.out.println("pull return null!");

     queue.offer(scanner.next());
     System.out.println("**********************");
     if (queue.peek() != null)
         System.out.println("peek return not null!");
     if (queue.pull() != null)
         System.out.println("pull return not null!");

 }
}