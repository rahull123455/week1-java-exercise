package exercise1.level2;

public class Book {

    String title;
    String author;

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.title = "The Great Gatsby";
        myBook.author = "F. Scott Fitzgerald";

        myBook.displayInfo();
    }
}
