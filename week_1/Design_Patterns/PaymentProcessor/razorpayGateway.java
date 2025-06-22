package Design_Patterns.PaymentProcessor;

public class razorpayGateway {
     public void makePayment(double amount){
          System.out.println("payment of :"+amount+" was successful via Razorpay.");
     }
}

class razorpayAdapter implements PaymentProcessor{
     razorpayGateway pay = new razorpayGateway();
     public void ProcessPayment(double amount){
          pay.makePayment(amount);
     }
}