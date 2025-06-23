package Design_Patterns.StratergyPattern;

public class PaymentContext {
     private PaymentStratergy stratergy;
     public void setPaymentStratergy(PaymentStratergy stratergy){
          this.stratergy=stratergy;
     }
     
     public void processPayment(double amount){
          if(stratergy==null){
               System.out.println("No payment method selected.");
          }else{
               stratergy.pay(amount);
          }
     }
}
