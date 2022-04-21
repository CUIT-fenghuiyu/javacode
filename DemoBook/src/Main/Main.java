package Main;

import User.User;
import User.AdminUser;
import User.GeneraUser;
import Book.BookList;

import java.util.Scanner;

public class Main {

    public static User loginUser(){
        String name;
        int id;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        name = scanner.next();
        System.out.println("请输入你的身份：1-》管理员，0-》普通用户");
        id = scanner.nextInt();
        if(id == 1){
            return new AdminUser(name);
        }else{
            return new GeneraUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        int choice;
        User user = loginUser();

        while (true) {
            choice = user.menu();
            user.doOperation(bookList, choice);
        }
    }
}
