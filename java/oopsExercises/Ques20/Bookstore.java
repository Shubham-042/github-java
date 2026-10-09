package oopsExercises.Ques20;
import java.util.*;
import java.util.Scanner;
//Create a class Book with data members Title, Author, Cost, and noOfBooks.
// Implement a function to display information about the book. Also:
//Create 3 instances of the Book class and initialize the data members.
//Accept a title and noOfBooks from the user.
// Check if the book exists and if sufficient copies are available.
// If so, calculate and display the total cost.
public class Bookstore {
    public static void main(String[] args) {
        Book b1=new Book("java","shubham",230,20);
        Book b2=new Book("cpp","aman",300,22);
        Book b3=new Book("python","shubh",100,50);
        b1.display();
        b2.display();
        b3.display();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter requested Title");
        String requestedTitle=sc.nextLine();
        System.out.println("Enter requested copies ");
        int requestedCopies=sc.nextInt();
        boolean found=false;
        if(requestedTitle.equalsIgnoreCase(b1.title)){
            found= b1.checkAvailability(requestedCopies);
        }else if(requestedTitle.equalsIgnoreCase(b2.title)){
            found=b2.checkAvailability(requestedCopies);
        }else if(requestedTitle.equalsIgnoreCase((b3.title))){
            found=b3.checkAvailability(requestedCopies);
        }

        if(!found){
            System.out.println("Insufficient copies ");
        }
    }



}
