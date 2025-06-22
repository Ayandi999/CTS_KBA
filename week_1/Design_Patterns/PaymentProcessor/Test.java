package Design_Patterns.PaymentProcessor;
import java.util.Scanner;
public class Test {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount you want to transfer:");
          double amount = sc.nextDouble();
          System.out.println("Choose the payment gateway:");
          System.out.println("1. Gpay");          
          System.out.println("2. Razorpay");
          int choice = sc.nextInt();
          switch (choice) {
               case 1:
                    GpayAdapter payment1 = new GpayAdapter();
                    payment1.ProcessPayment(amount);
                    break;
               case 2:
                    razorpayAdapter payment2 = new razorpayAdapter();
                    payment2.ProcessPayment(amount);
                    break;
               default:
                    System.out.println("Invalid choice. Please select a valid payment gateway.");
                    sc.close();
                    break;
          }
     }
}
