package EX1;
import java.util.HashMap;
import java.util.Scanner; 


class Product{
     int productId;
     String productName;
     int quantity;
     double price;
     //Making the constructor:
     Product(int productId,String productName,int quantity,double price){
          this.productId = productId;
          this.productName = productName;
          this.quantity = quantity;
          this.price = price;
     }
}

public class Inventory{
     //this method shows all the items in store:
     void display_inventory(){
          if(prod.isEmpty()) System.out.println("No products in the inventory");    
          else{
               System.out.println("Product ID\tProduct Name\tquantity\tPrice");
               for( Product product : prod.values()){
                    System.out.println(product.productId+"\t"+product.productName+"\t"+product.quantity+"\t"+product.price);
               }
          }
     }
     //This hashmap will store all the products entered also help to update ansd delete the products
     HashMap<Integer,Product> prod = new HashMap<>();
     //This method will help to add a new product
     public void add_product(Product product){
          //Checking if product already exists
          if(prod.containsKey(product.productId)){
               System.out.println("Product alredy exists");
          }else{
               prod.put(product.productId, product);
               System.out.println("New product"+product.productId+"with name:"+product.productName+ "has been entered");
          }
     }

     //Method to update the product
     public void update_product(Product product){
          //checking id product alredy exists:
          if(prod.containsKey(product.productId)){
               prod.put(product.productId, product);
               System.out.println("The product was updated");
          }else{
               System.out.println("Product doensn't exist.Please enter a valid product id");
          }
     }

     //Method to delete the product:
     public void delete_product(int id){
          //Checking if it's valid product id:
          if(prod.containsKey(id)){
               prod.remove(id);
               System.out.println("The product was deleted");
          }else{
               System.out.println("Product Idnot found please enter a vlid product id");
          }
     }
}

class InventoryManagement{
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          Inventory inventory = new Inventory();
               
          System.out.println("Wlcome to the Inventory Management System");
          int choice =0;
          while(choice!=5){
               System.out.println("Available options:\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Display Inventory\n5. Exit");
               choice = sc.nextInt();
               switch(choice){
                    case 1:
                         System.out.println("Enter the product Id:");
                         int ID = sc.nextInt();
                         System.out.println("Enter the product Name:");
                         String name=sc.next();
                         System.out.println("Enter the quantity:");
                         int quantity = sc.nextInt();
                         System.out.println("Enter the price:");
                         double price = sc.nextDouble();
                         Product product = new Product(ID,name,quantity,price);
                         inventory.add_product(product);
                         break;
                    case 2:
                         System.out.println("Enter the product Id to update:");
                         int updateId = sc.nextInt();
                         System.out.println("Enter the new product Name:");
                         String updateName = sc.nextLine();
                         System.out.println("Enter the new quantity:");
                         int updateQuantity = sc.nextInt();
                         System.out.println("Enter the new price:");
                         double updatePrice = sc.nextDouble();
                         Product updateProduct = new Product(updateId,updateName,updateQuantity,updatePrice);
                         inventory.update_product(updateProduct);
                         break;
                    case 3:
                         System.out.println(("Enter the product Id  to delete:"));
                         int id=sc.nextInt();
                         inventory.delete_product(id);
                         break;
                    case 4:
                         inventory.display_inventory();
                         break;
                    case 5:
                         System.out.println("Thanks for using the Inventory Management System. Goodbye!");
                         sc.close();
                    default:
                         System.out.println("Invalid choice. Please try again.");
                    }
          }
     }
}