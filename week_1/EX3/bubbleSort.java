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

class BubbleSort {
     void sort(Product[] products){
          int len=products.length;
          for(int i=0;i<len;i++){
               for(int j=0;j<len-i-1;j++){
                    if(products[j].productId > products[j+1].productId){
                         //Swapping the products
                         Product temp = products[j];
                         products[j] = products[j+1];
                         products[j+1] = temp;
                    }
               }
          }

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

          BubbleSort bubbleSort = new BubbleSort();
          bubbleSort.sort(products);

          for(Product product : products) {
               System.out.println("Product ID: " + product.productId + ", Name: " + product.productName + ", Category: " + product.category);
          }
          
     }
}