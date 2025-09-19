//Name: Jayla Craddock
//Date: 9/19/25
//Assignment: Team Assignment Part 2
import java.util.ArrayList; // Import the arraylist class
import java.util.Scanner; //Import the scanner class

public class Books {
    public static void main(String[] args){
    
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


