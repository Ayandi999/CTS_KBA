package EX3;
import java.util.Scanner;

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

class quickSort {
     public static void quicksort(Product[] product,int low,int high){
          if(low<high){
               int partition_index = partition(product,low,high);
               quicksort(product, low, partition_index-1);
               quicksort(product, partition_index+1, high);
          }
     }
     public static int partition(Product[] products,int low,int high){
          Product pivot = products[high];
          int i=low-1;
          for(int j=low;j<high;j++){
               if(products[j].productId <= pivot.productId){
                    i++;
                    //swap products[i] and products[j]
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
               }
          }
          Product temp = products[i+1];
          products[i+1] = products[high];
          products[high] = temp;
          return i+1;
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
          sc.close();
          quicksort(products, 0, prod_number-1);
          System.out.println("Sorted array is:");
               for(int i=0;i<prod_number;i++){
                    System.out.println("Product ID: " + products[i].productId + ", Name: " + products[i].productName + ", Category: " + products[i].category);
               }
     }
}