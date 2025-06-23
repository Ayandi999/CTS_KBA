package Design_Patterns.DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier{
     //Refference to notifier object
     Notifier notifier;

     //Crating a constructor
     public NotifierDecorator(Notifier notifier){
          this.notifier=notifier;
     }

     //Implimnting the send method:
     public void send(String message){
          notifier.send(message);
     }
}
