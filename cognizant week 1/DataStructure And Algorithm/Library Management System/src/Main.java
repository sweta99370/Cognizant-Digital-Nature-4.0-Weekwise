public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Data Structures", "Mark Allen Weiss"));
        library.addBook(new Book(103, "Clean Code", "Robert C. Martin"));

        System.out.println("All Books in Library:");
        library.displayAllBooks();

        System.out.println("\n Linear Search for 'Clean Code':");
        Book result1 = library.linearSearch("Clean Code");
        System.out.println(result1 != null ? result1 : "Book not found");

        System.out.println("\n Binary Search for 'Data Structures':");
        Book result2 = library.binarySearch("Data Structures");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
