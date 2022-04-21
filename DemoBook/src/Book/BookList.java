package Book;

import java.lang.reflect.Array;

public class BookList {
    public int amount;
    private Book[] books = new Book[10];



    public Book[] getBooks() {
        return books;
    }

    public BookList(){
        books[0] = new Book("三国演义", "罗贯中", "小说", 90);
        books[1] = new Book("西游记","吴承恩","小说",78);
        books[2] = new Book("红楼梦","曹雪芹","小说",89);

        amount = 3;
    }

    public void addBook(Book book){
        books[amount] = book;
        amount++;
    }

    public void deleteBook(String bookName){
        int tap = 0;
        for (int i=0; i<=amount;i++){
            if(bookName.equals(books[i].getName())){
                for (int j=i; j<amount-1; j++){
                    books[j] = books[j+1];
                }
                amount--;
                System.out.println("删除成功");
                tap = 1;
                break;
            }
        }

        if(tap == 0){
            System.out.println("删除失败,未查询到该图书");
        }
    }

    public void queryBook(String name){
        int tap=0;
        for (int i=0; i<amount;i++){
            if(name.equals(books[i].getName())){
                System.out.println(books[i]);
                tap = 1;
                break;
            }
        }

        if(tap == 0){
            System.out.println("查询失败,未查询到该图书");
        }
    }

    public void borrowBook(String bookName){
        for (int i=0; i<amount; i++){
            if(bookName.equals(books[i].getName())){
                if(books[i].getState().equals("未借出")) {
                    books[i].setState("已借出");
                    System.out.println("借阅成功，请及时归还");
                    return;
                }else {
                    System.out.println("该书已被借阅!");
                    return;
                }
            }
        }

        System.out.println("未查询到该图书！");
    }

    public void returnBook(String bookName){
        int tap=0;
        for (int i=0; i<amount;i++){
            if(bookName.equals(books[i].getName()) && "已借出".equals(books[i].getState())){
                books[i].setState("未借出");
                System.out.println("归还成功！");
                tap = 1;
                break;
            }
        }

        if(tap == 0){
            System.out.println("未查询到你要归还的图书");
        }
    }

    public void displayBooks(){
        for (int i=0; i< amount;i++){
            System.out.println(books[i]);
        }
    }

    public void exitSystem(){
        System.out.println("退出系统！");

        System.exit(0);
    }
}
