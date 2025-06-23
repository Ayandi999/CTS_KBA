package Design_Patterns.ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("cat.png");
        Image img2 = new ProxyImage("dog.png");

        // Image not loaded yet
        System.out.println("First call to display cat.png:");
        img1.display();  // Loads from server

        System.out.println("\nSecond call to display cat.png:");
        img1.display();  // Uses cached RealImage

        System.out.println("\nDisplay dog.png:");
        img2.display();  // Loads from server
    }
}
