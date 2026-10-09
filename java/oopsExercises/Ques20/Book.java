package oopsExercises.Ques20;
//Create a class Book with data members Title, Author, Cost, and noOfBooks.
// Implement a function to display information about the book. Also:
//Create 3 instances of the Book class and initialize the data members.
//Accept a title and noOfBooks from the user.
// Check if the book exists and if sufficient copies are available.
// If so, calculate and display the total cost.
  public class Book {
     public String title;
     public String author;
     public double cost;
     public int noOfBooks;

     public Book(String title,String author,double cost,int noOfBooks){
         this.title=title;
         this.author=author;
         this.cost=cost;
         this.noOfBooks=noOfBooks;
     }

     public void display(){
         System.out.println("Title :"+title);
         System.out.println("Author :"+author);
         System.out.println("Cost :"+cost);
         System.out.println("Number of Books :"+noOfBooks);

     }

     public boolean checkAvailability(int requestedCopies){
         if(requestedCopies<=noOfBooks){
             double totalCost=requestedCopies*cost;
             System.out.println("Book is available and cost is :"+totalCost);
             return true;
         }else{
             System.out.println("Insufficient copies");
             return false;
         }
     }


}
