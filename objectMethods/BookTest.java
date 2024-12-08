package objectMethods;

public class BookTest {
    public static void main(String[] args) {
        // Create an instance of Author
        Author author = new Author("Marcus Laurence", "marcus@pogi.com");

        // Display the author info
        System.out.println("Author name=" + author.getName() + ", email=" + author.getEmail());

        // Set a new email for the author
        author.setEmail("marcuslaurence@pogi.com");

        // Display the updated author info
        System.out.println("Author name=" + author.getName() + ", email=" + author.getEmail());
        System.out.println();
        
        // Create an instance of Book
        Book book = new Book("0061964360", "Intermediate Programing using Java", author, 3200.25, 120);

        // Display the book info
        System.out.println("Book isbn=" + book.getIsbn() + ", Title=" + book.getTitle() + ", Author name=" + book.getAuthor().getName() + ", email=" + book.getAuthor().getEmail() + ", price=" + book.getPrice() + ", quantity=" + book.getQty() + "]");

        // Set a new price and quantity for the book
        book.setPrice(4675.75);
        book.setQty(180);

        // Display the updated book info
        System.out.println("Book isbn=" + book.getIsbn() + ", Title=" + book.getTitle() + ", Author name=" + book.getAuthor().getName() + ", email=" + book.getAuthor().getEmail() + ", price=" + book.getPrice() + ", quantity=" + book.getQty() + "]");

        // Display the book info
        System.out.println();
        System.out.println("ISBN: \t\t" + book.getIsbn());
        System.out.println("Title: \t\t" + book.getTitle());
        System.out.println("Price: \t\t" + book.getPrice());
        System.out.println("Quantity: \t" + book.getQty() + " pcs");
        System.out.println("Author: \tAuthor name=" + book.getAuthor().getName() + ", email=" + book.getAuthor().getEmail());
        System.out.println("Author's Name: \t" + book.getAuthor().getName());
        System.out.println("Author's Email: " + book.getAuthor().getEmail());
    }
}