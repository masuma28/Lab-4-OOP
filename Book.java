public class Book {
    int ISBN;
    String bookTitle;
    int numberOfPages;
    static int count = 0;

    // Constructor
    public Book(int isbn, String title, int pages) {
        ISBN = isbn;
        bookTitle = title;
        numberOfPages = pages;
        count++;
    }

    // Default constructor
    public Book() {
        count++;
    }

    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + bookTitle + ", Pages: " + numberOfPages;
    }

    public int compareTo(Book b) {
        if (this.numberOfPages > b.numberOfPages)
            return 1;
        else if (this.numberOfPages < b.numberOfPages)
            return -1;
        else
            return 0;
    }

    public static int getCount() {
        return count;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

