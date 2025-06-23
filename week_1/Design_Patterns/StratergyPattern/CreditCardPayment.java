package Design_Patterns.StratergyPattern;

public class CreditCardPayment implements PaymentStratergy{
     private String cardNumber;
     private String cardHolder;
     public CreditCardPayment(String cardNumber,String cardHolder){
          this.cardHolder=cardHolder;
          this.cardNumber=cardNumber;
     }
     public void pay(double amount){
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber + " By" + cardHolder);
     }
}
