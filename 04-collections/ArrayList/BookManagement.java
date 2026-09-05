import java.util.ArrayList;
import java.util.Scanner;

class Book {

    private int bookId;
    private String title;
    private String author;

    // Constructor
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Get Book ID
    public int getBookId() {
        return bookId;
    }

    // Display Book Details
    public void showDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------");
    }
}

public class BookManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== BOOK MANAGEMENT =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // Add Book
                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book b = new Book(id, title, author);

                    books.add(b);

                    System.out.println("Book added successfully.");

                    break;


                // View Books
                case 2:

                    if (books.size() == 0) {

                        System.out.println("No books available.");

                    } else {

                        System.out.println("\n===== BOOK LIST =====");

                        for (int i = 0; i < books.size(); i++) {

                            books.get(i).showDetails();
                        }
                    }

                    break;


                // Search Book
                case 3:

                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();

                    int found = 0;

                    for (int i = 0; i < books.size(); i++) {

                        if (books.get(i).getBookId() == searchId) {

                            System.out.println("Book Found:");

                            books.get(i).showDetails();

                            found = 1;
                            break;
                        }
                    }

                    if (found == 0) {
                        System.out.println("Book not found.");
                    }

                    break;


                // Delete Book
                case 4:

                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();

                    int deleted = 0;

                    for (int i = 0; i < books.size(); i++) {

                        if (books.get(i).getBookId() == deleteId) {

                            books.remove(i);

                            System.out.println("Book deleted successfully.");

                            deleted = 1;
                            break;
                        }
                    }

                    if (deleted == 0) {
                        System.out.println("Book not found.");
                    }

                    break;


                // Exit
                case 5:

                    System.out.println("Program closed.");
                    break;


                default:

                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}