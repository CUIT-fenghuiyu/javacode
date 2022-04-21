package Operation;

import Book.BookList;

import java.util.Scanner;

public class QueryOperation implements IOperation{
    private String bookName;
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要查询的图书名字");
        bookName = scanner.next();

        bookList.queryBook(bookName);
    }
}
