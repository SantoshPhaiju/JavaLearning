package classesobjects;

public class MainClass {
    public static void main(String[] args) {
        Book RichDadPoorDad = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 960, "Financial Literacy", 356);

        System.out.println("Name of the book is: " + RichDadPoorDad.getTitle());
        System.out.println("Author of the book is: " + RichDadPoorDad.getAuthor());
        System.out.println("Price of the book is: " + RichDadPoorDad.getPrice());
        System.out.println("Type of the book is: " + RichDadPoorDad.getType());
        System.out.println("Number of pages of the book is: " + RichDadPoorDad.getPages());

    }
}
