package EX2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//Product class defines the products internal structure 

class Product{
     int productId;
     String productName;
     String category;
     //Making the constructor:
     Product(int productId,String productName,String category){
          this.productId = productId;
          this.productName = productName;
          this.category = category;
     }
}


class SerchFunction{
     /*The searching time complexity with Linear search is O(n) in worst case
     and it is O(1) in best case if the first elemnt is the required element.*/ 

     public static boolean LinearSearch(Product[] product,int searchId){
          boolean found=false;
          for(int i=0;i<product.length;i++){
               if(searchId == product[i].productId){
                    found=true;
                    break;
               }
          }
          return found;

     }

     /*The searching time complexity with binary search is O(log n) in worst case
     and it is O(1) in best case if the middle elemnt is the required element.*/ 

     public static boolean BinarySearch(Product[] product,int searchId){
          boolean found=false;
          //Array is sorted by productId for binary search
          Arrays.sort(product, Comparator.comparingInt(p -> p.productId));
          int low,high,mid;
          low=0;
          high=product.length-1;
          while (low<high) {
               mid=(low+high)/2;
               if(product[mid].productId == searchId){
                    found=true;
                    break;
               }else if(product[mid].productId < searchId) low=mid+1;
               else high=mid-1;
          }

          return found;  
     }
     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          System.out.print("Enter the number of products in the array:");
          int prod_number = sc.nextInt();
          System.out.println("Enter the products one by one:");
          Product[] products = new Product[prod_number];
          for(int i=0;i<prod_number;i++){
               System.out.print("Enter the product ID:");
               int id=sc.nextInt();
               sc.nextLine(); //Consume the newline character
               System.out.print("Enter the product Name:");
               String name=sc.next();
               System.out.print("Enter the product Category:");
               String category=sc.next();

               products[i] = new Product(id,name,category);
               System.out.println("Product added: ID=" + id + ", Name=" + name + ", Category=" + category);
          }
          System.out.println("Enter the product Id to search:");
          int SearchID=sc.nextInt();
          boolean found_by_linear_search=LinearSearch(products, SearchID);
          boolean found_by_binary_search=BinarySearch(products, SearchID);
          if(found_by_linear_search) System.out.println("The element was found using Liear search");
          else System.out.println("The element was not found using Liear search");
          if(found_by_binary_search) System.out.println("The element was found using Binary search");
          else System.out.println("The element was not found using Binary search");  
          sc.close();
     }
}