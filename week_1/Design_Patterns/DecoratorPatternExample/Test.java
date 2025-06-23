package Design_Patterns.DecoratorPatternExample;

public class Test {
     public static void main(String[] args) {
          Notifier baseNotifier = new EmailNotifier();

          // Add SMS and Slack notifications
          Notifier multiChannelNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(baseNotifier));

          multiChannelNotifier.send("System alert: Server down!");
     }
}
