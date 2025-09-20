//Name: Jayla Craddock, Jeffrey Ortegon, Sahima Durrani, Ryan, Bahdan
//Date 9/20/2025
import java.util.Scanner;
import java.util.ArrayList; // Import the arraylist class

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
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.print("Enter the title of the book (or type 'exit' to quit): ");
        String searchTitle = input.nextLine();

        if (searchTitle.equalsIgnoreCase("exit")) break;

        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found: " + books[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}




	public static void main(String[] args) {
//Fixed size array to store 5 book titles with methods to add, display, and search for books
		addBook();
        displayBook();
        bookSearch();
          //Array List for books.
    ArrayList<String> books = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    
    //Input from user.
    String input;
    
    //Stop to help break out of loop.
    String str1 = "stop";

//Introduce the user to the database.
System.out.println("Welcome to the Book Database! Enter a book title into the database. To stop type the word stop. ");

//While loop for adding book titles.
while (true){
    System.out.println("Book title: " );
    input = keyboard.nextLine();

    if(input.equalsIgnoreCase(str1)){
        break;
    }

    books.add(input);
}

//While loop for removing book titles.
while (true){
    System.out.println("Remove a book: " );
    input = keyboard.nextLine();

    if(input.equalsIgnoreCase(str1)){
        break;
    }

    books.remove(input);

}


//Display the book titles in the array.
System.out.println("Your list of book titles: ");
for (String book : books) {
    System.out.println(book);
}

//Sequential search using a while loop
while(true){
    
    System.out.println("Search a title in your database: ");
String searchInput = keyboard.nextLine();

int index = books.indexOf(searchInput);
    if (index != -1){
    System.out.println("Book title: " + searchInput + " found at index: " + index);
    break;
} else {
    System.out.println("Sorry, " + searchInput + " is not in the database.");
    System.out.println("Try again: ");
    searchInput = keyboard.nextLine();
   
}


}
      

	}

}


