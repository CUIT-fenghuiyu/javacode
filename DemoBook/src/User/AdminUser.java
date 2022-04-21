package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String userName) {
        super(userName);
        this.ioperations = new IOperation[]{
                new ExitOperation(),
                new QueryOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }


    public int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello " + super.userName + " 欢迎来到图书馆\n" +
                     "1.查找图书\n" +
                     "2.新增图书\n" +
                     "3.删除图书\n" +
                     "4.显示图书\n" +
                     "0.退出系统\n" +
                     "请输入你的操作: ");

        int choice = scanner.nextInt();
        return choice;
        }

    @Override
    public void doOperation(BookList bookList, int choice) {
        ioperations[choice].work(bookList);
    }
}
