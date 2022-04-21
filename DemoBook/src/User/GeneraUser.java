package User;

import Book.BookList;
import Operation.*;

import java.util.Scanner;

public class GeneraUser extends User{


    public GeneraUser(String userName) {
        super(userName);
        this.ioperations = new IOperation[] {
                new ExitOperation(),
                new QueryOperation(),
                new BorrowIoperation(),
                new ReturnOperation(),
                new DisplayOperation()
        };
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nhello " + super.userName + " 欢迎来到图书馆\n" +
                "1.查找图书\n" +
                "2.借阅图书\n" +
                "3.归还图书\n" +
                "4.显示图书\n" +
                "0.退出系统");

        int choice = scanner.nextInt();
        return choice;
    }

    @Override
    public void doOperation(BookList bookList, int choice) {
        ioperations[choice].work(bookList);
    }
}
