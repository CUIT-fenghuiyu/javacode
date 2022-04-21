package Operation;

import Book.Book;
import Book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        bookList.displayBooks();
    }
}
