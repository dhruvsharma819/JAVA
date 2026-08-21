class Book {
    final String isbn = "6868";
    String title = "Harry Potter";
    String author = "J. K. Rowling.";
    double price = 499;

    void displayBook() {
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class library {
    public static void main(String[] args) {
        Book b = new Book();
        b.displayBook();
    }
}