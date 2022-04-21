package Operation;

import Book.BookList;
import com.sun.javaws.exceptions.ExitException;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        bookList.exitSystem();
    }
}
