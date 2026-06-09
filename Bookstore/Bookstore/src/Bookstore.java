//Name: Jayla Craddock, Jeffrey Ortegon, Sahima Durrani, Ryan Kostka, Bahdan Mikhailau
//Date 9/20/2025 updated on 6/9/2026
import java.util.Scanner;
import java.util.ArrayList; 


//Part 1: Array Implementation
//Name: Jeffrey Ortegon, Sahima Durrani
public class Bookstore {
    static String[] books = new String[5];
    static String[] genres = new String[5];
    static int bookCount = 0;
    static Scanner input = new Scanner(System.in); // FIXED: Single Scanner instance

    // Method to add books
    public static void addBook() {
        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter a book into the Library Database: ");
            books[i] = input.nextLine();
            System.out.print("Now enter the genre of the book: ");
            genres[i] = input.nextLine();
            System.out.println("The book " + books[i] + " with the genre " + genres[i] + " has been entered in the library.");
        }
    }

    // Method to display books
    public static void displayBook() {
        System.out.println("Here are your books you've entered into the Database:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i] + " (" + genres[i] + ")");
        }
    }
    
    //Part 2: ArrayList Implementation
    //Name: Jayla Craddock
    public static void main(String[] args) {
        addBook();
        displayBook();
        bookSearch();

        //ArrayList section
        ArrayList<String> dynamicBooks = new ArrayList<>();
        String inputStr;

        System.out.println("Welcome to the Book Database! Enter book titles. Type 'stop' to exit.");

        // Add books 
        while (true) {
            System.out.print("Book title: ");
            inputStr = input.nextLine();
            if (inputStr.equalsIgnoreCase("stop")) break;
            dynamicBooks.add(inputStr);
        }

        // Remove books
        while (true) {
            System.out.print("Remove a book (or type 'stop' to exit): ");
            inputStr = input.nextLine();
            if (inputStr.equalsIgnoreCase("stop")) break;
            if (!dynamicBooks.remove(inputStr)) {
                System.out.println("Book not found in the list.");
            }
        }

        // Display books
        System.out.println("Your list of book titles:");
        if (dynamicBooks.isEmpty()) {
            System.out.println("No books in the database.");
        } else {
            for (String book : dynamicBooks) {
                System.out.println(book);
            }
        }

        // Sequential search in ArrayList
        while (true) {
            System.out.println("Search a title in your database (or type 'stop' to exit): ");
            String searchInput = input.nextLine();
            if (searchInput.equalsIgnoreCase("stop")) break;

            int index = dynamicBooks.indexOf(searchInput);
            if (index != -1) {
                System.out.println("Book title: " + searchInput + " found at index: " + index);
            } else {
                System.out.println("Sorry, " + searchInput + " is not in the database.");
            }
        }
        
        // Close scanner at the end
        input.close();
    }

    // Part 3: Method to search for books by either name or genre.
    //Name: Ryan Kostka
    public static void bookSearch() {
        while (true) {
            System.out.println("Do you want to search by 'name' or 'genre'? ");
            String searchChoice = input.nextLine();

            if (searchChoice.equalsIgnoreCase("exit")) break;

            // Name searching
            if (searchChoice.equalsIgnoreCase("name")) {
                System.out.print("Enter the title of the book (or type 'exit' to quit): ");
                String searchTitle = input.nextLine();

                boolean found = false;
                for (int i = 0; i < books.length; i++) {
                    if (books[i] != null && books[i].equalsIgnoreCase(searchTitle)) {
                        System.out.println("Book found: " + books[i] + " (" + genres[i] + ")");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book not found.");
                }
            }

            // Genre searching
            else if (searchChoice.equalsIgnoreCase("genre")) {
                System.out.print("Enter the genre of the book: ");
                String searchGenre = input.nextLine();

                boolean found = false;
                for (int i = 0; i < genres.length; i++) {
                    if (genres[i] != null && genres[i].equalsIgnoreCase(searchGenre)) {
                        System.out.println("Book found: " + books[i] + " (" + genres[i] + ")");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No books found for this genre.");
                }
            }
        }
    }
}

/*Part 4: Arrays vs. ArrayList 
in handling static and dynamic datasets
//Name: Bahdan Mikhailau
   
- Arrays:

*The data is static and the size of this
type of dataset cannot be changed.

*This type of dataset is best suited for cases
when the data is predefined and the total number 
of elements is known in advance.

*Arrays provide less flexibility when operating on data.

*This type of dataset provides fast access to the elements 
using index.

- ArrayList:

*The data is dynamic and the elements can be added and 
removed with the dataset adjusting its size.

*This type of dataset is best suited for realistic cases
when the data is constantly changing over time.

*This type of dataset provides slower access to the elements,
however, it is much more convenient to add or remove elements.

- Conclusion:
Arrays should be used in "static" datasets when the data is predefined 
and the size of the dataset is known. ArrayList is well suited for
"dynamic" datasets, which is a more realistic case because data is
changing over time.
*/
