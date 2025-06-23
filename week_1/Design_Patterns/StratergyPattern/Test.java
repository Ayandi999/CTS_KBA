package Design_Patterns.StratergyPattern;

public class Test {
     public static void main(String[] args) {
          PaymentContext context = new PaymentContext();

          // Use Credit Card
          context.setPaymentStratergy(new CreditCardPayment("1234-5678-9876-5432", "Alice"));
          context.processPayment(2500);

          // Switch to PayPal
          context.setPaymentStratergy(new PayPalPayment("alice@example.com"));
          context.processPayment(1800);
     }
}
