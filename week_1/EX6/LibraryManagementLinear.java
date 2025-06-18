package EX6;
import java.util.Scanner;     

class Book{
     int bookId;
     String title;
     String author;
     Book(int bookId, String title, String author) {
         this.bookId = bookId;
         this.title = title;
         this.author = author;
     }
}

public class LibraryManagementLinear {
     public static int LinearBookSearch(Book[] books,String searchTitle){
          int foundId=-1;
          for(int i=0;i<books.length;i++){
               if(books[i].title.equalsIgnoreCase(searchTitle)){
                    foundId=books[i].bookId;
                    break;
               }
          }
          return foundId;
     }
     
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          //Taking user input to start entering books
          System.out.println("Enter the number of books that you want to enter:");
          int BookCount = sc.nextInt();
          Book[] book=new Book[BookCount];
          System.out.println("Enter the book details :");
          for(int i=0;i<BookCount;i++){
               
               System.out.println("Enter the BookID:");
               int bookID=sc.nextInt();
               sc.nextLine(); // Consume the newline character left by nextInt()
               System.out.println("Enter book title:");
               String title=sc.nextLine();
               System.out.println("Enter the author name:");
               String author=sc.nextLine();
               book[i]=new Book(bookID, title, author);
               System.out.println("Book with Id:"+book[i].bookId+" Title:"+book[i].title+" Author:"+book[i].author+" has been added successfully.");
          }
          //Asking user to enter the book title to search:
          System.out.println("Enter the Book Title to search:");
          String searchTitle = sc.nextLine();
          int found=LinearBookSearch(book,searchTitle);
          if(found>=0) System.out.println("Book was found. BookId is:"+found);
          else System.out.println("Book was not found.");
          sc.close();
     }
}
