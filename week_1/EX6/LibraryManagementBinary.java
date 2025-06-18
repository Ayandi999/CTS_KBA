package EX6;
import java.util.Scanner; 
import java.util.Comparator; //For comparator.comparingStrind() method
import java.util.Arrays; //for Arrays.sort()    

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

public class LibraryManagementBinary {
     public static int BinarySearch(Book[] books,String searchTitle){
          int low = 0;
          int high = books.length -1;
          while(low<=high){
               int mid=(low+high)/2;
               //Book was found:
               if(books[mid].title.equalsIgnoreCase(searchTitle)) return books[mid].bookId;
               else if(books[mid].title.compareToIgnoreCase(searchTitle)<0) low=mid+1;
               else high=mid-1;
          }return -1;
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
          Arrays.sort(book, Comparator.comparing(b -> b.title , String.CASE_INSENSITIVE_ORDER));
          int found=BinarySearch(book,searchTitle);
          if(found>=0) System.out.println("Book was found. BookId is:"+found);
          else System.out.println("Book was not found.");
          sc.close();
     }
}
