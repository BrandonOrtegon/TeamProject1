import java.util.Scanner;

public class Bookstore {
	static String[] books = new String[5];
    static int bookCount = 0;
    
//Method to add books
    public static void addBook() {
        for(int i = 0; i < books.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a book into the store library: ");
            books[i] = input.nextLine();
            System.out.println("You've entered: " + books[i] + " into the store library");
        }
    }

//Method to display books
    public static void displayBook() {
    	System.out.println("Here are your books you've entered into the bookstore:");
        for(int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i]);
        }
    }
    
//Method to search for books
    public static void bookSearch() {

        
    }
	

	public static void main(String[] args) {
//Fixed size array to store 5 book titles with methods to add, display, and search for books
		addBook();
        displayBook();
        bookSearch();

	}

}
