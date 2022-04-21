package Operation;

import Book.BookList;
import Book.Book;


import java.util.Scanner;

public class AddOperation implements IOperation{
    String bookName;
    String writer;
    String type;
    int price;

    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字:");
        bookName = scanner.next();
        System.out.println("请输入作者的名字:");
        writer = scanner.next();
        System.out.println("请输入图书的类型:");
        type = scanner.next();
        System.out.println("请输入图书的价格:");
        price = scanner.nextInt();

        Book book = new Book(bookName,writer,type,price);
        for (int i=0;i<bookList.amount;i++){
            if(bookName.equals(bookList.getBooks()[i].getName())){
                System.out.println("该图书已存在，请勿重复添加");
                return;
            }
        }
        bookList.addBook(book);
        System.out.println("添加成功");
    }
}
