package classesobjects;

public class Book {
    private String title;
    private String author;
    private String type;
    private int price;
    private int pages;

    // Non-Argument constructor
    Book() {
        System.out.println("New book instance created without anything!");
    }

    // Argument constructor
    Book(String title, String author, int price, String type, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.type = type;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
