package Book;

public class Book {
    private String name;
    private String author;
    private String type;
    private int price;
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Book(String name, String author, String type, int price) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.state = "未借出";
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + "{" +
                "author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", " + state +
                '}';
    }
}
