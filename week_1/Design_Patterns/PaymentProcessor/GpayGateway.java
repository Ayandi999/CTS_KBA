package Design_Patterns.PaymentProcessor;

public class GpayGateway {
     public void pay(double amount){
          System.out.println("Payment of amount:"+amount+" was Successful via Gpay.");
     }
}

class GpayAdapter implements PaymentProcessor{
     GpayGateway payment=new GpayGateway();
     public void ProcessPayment(double amount){
          payment.pay(amount);
     }
}