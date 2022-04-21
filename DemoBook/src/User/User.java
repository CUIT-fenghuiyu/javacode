package User;

import Book.BookList;
import Operation.IOperation;

public abstract class User {
    public String userName;
    public IOperation[] ioperations;

    public User(String userName) {
        this.userName = userName;
    }

    abstract public int menu();

    public void doOperation(BookList bookList, int choice){
        ioperations[choice].work(bookList);
    };

}
