package com.Google;
import java.util.Scanner;
//�ඨ��������ඨ��Ĵ��������Ĵ𰸡�

//�����ǲ��Դ��룬����д����Ĵ��У�
public class Main {
 public static void main(String[] args) {
     Stack stack = new Stack();
     Scanner scanner = new Scanner(System.in);

     for (int i = 0; i < 5; i++) {
         stack.push(scanner.next());
     }

     for (int i = 0; i < 5; i++) {
         System.out.println("--------------------------------");
         System.out.printf("Size of stack is %d, the top element is:%s\n", stack.getSize(), stack.peek());
         System.out.printf("Pop element:%s\n", stack.pop());
         System.out.println(stack.empty() ? "Stack is empty!" : "Stack is not empty!");
     }

     System.out.println("**********************");
     if (stack.peek() == null)
         System.out.println("peek return null!");
     if (stack.pop() == null)
         System.out.println("pop return null!");

     stack.push(scanner.next());
     System.out.println("**********************");
     if (stack.peek() != null)
         System.out.println("peek return not null!");
     if (stack.pop() != null)
         System.out.println("pop return not null!");

 }
}