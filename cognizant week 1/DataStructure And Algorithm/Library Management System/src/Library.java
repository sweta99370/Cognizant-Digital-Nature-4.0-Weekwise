import java.util.Arrays;

public class Library {
    Book[] books;
    int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear search by title
    public Book linearSearch(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search by title (after sorting)
    public Book binarySearch(String title) {
        Arrays.sort(books, 0, count); // Sort only added elements
        int low = 0, high = count - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public void displayAllBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
