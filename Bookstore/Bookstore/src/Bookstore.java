//Name: Jayla Craddock, Jeffrey Ortegon, Sahima Durrani, Ryan Kostka, Bahdan Mikhailau
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
            System.out.print("Now enter the genre of the book: ");
            genres[i] = input.nextLine();
            System.out.println("The book " + books[i] + " with the genre " + genres[i] + " has been entered in the library.");
        }
    }

//Method to display books
    public static void displayBook() {
    	System.out.println("Here are your books you've entered into the bookstore:");
        for(int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i]);
        }
    }
    
 // Method to search for books by either name or genre.
public static void bookSearch() {
    Scanner input = new Scanner(System.in);
    while (true) {
    	System.out.print("Do you want to search by 'name' or 'genre'? ");
    	String searchChoice = input.nextLine();
    	// Name searching
    	if (searchChoice.equalsIgnoreCase("name")) {
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
	            break;
	        }
    	}
    	
    	// Genre searching
    	if (searchChoice.equalsIgnoreCase("genre")) {
	        System.out.print("Enter the genre of the book (or type 'exit' to quit): ");
	        String searchGenre = input.nextLine();
	
	        if (searchGenre.equalsIgnoreCase("exit")) break;
	
	        boolean found = false;
	        for (int i = 0; i < genres.length; i++) {
	            if (genres[i] != null && books[i].equalsIgnoreCase(searchGenre)) {
	                System.out.println("Book found: " + genres[i]);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Book not found.");
	            break;
	        }
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

/*Part 4: Arrays vs. ArrayList 
in handling static and dynamic datasets
   
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





