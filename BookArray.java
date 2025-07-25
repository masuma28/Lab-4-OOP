import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[5];

        // Take input from user
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter ISBN, Title, and Number of Pages for book " + (i + 1) + ":");
            int isbn = input.nextInt();
            input.nextLine(); // consume newline
            String title = input.nextLine();
            int pages = input.nextInt();
            input.nextLine(); // consume newline

            books[i] = new Book(isbn, title, pages);
        }

        // Print all book info
        System.out.println("\nAll Book Details:");
        for (Book b : books) {
            System.out.println(b.toString());
        }

        // Print total count
        System.out.println("\nTotal books created: " + Book.getCount());

        // Test compareTo
        System.out.println("\nComparing book 1 and book 2:");
        int result = books[0].compareTo(books[1]);
        if (result == 1)
            System.out.println("Book 1 has more pages.");
        else if (result == -1)
            System.out.println("Book 2 has more pages.");

            System.out.println("Both books have same number of pages.");

        // Test isThickBook method
        System.out.println("\nBooks with more than 500 pages:");
        for (Book b : books) {
            if (isThickBook(b)) {
                System.out.println(b.toString());
            }
        }
    }

    public static boolean isThickBook(Book b) {
        return b.getNumberOfPages() > 500;
    }
}