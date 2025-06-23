package Design_Patterns.CommandPatternExample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        System.out.println("Welcome to Home Automation System!");
        System.out.println("Enter command: 'on' to turn on, 'off' to turn off, 'exit' to quit.");

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
                case "on":
                    remote.setCommand(new LightOnCommand(light));
                    remote.pressButton();
                    break;
                case "off":
                    remote.setCommand(new LightOffCommand(light));
                    remote.pressButton();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Try 'on', 'off', or 'exit'.");
            }
        }
    }
}
