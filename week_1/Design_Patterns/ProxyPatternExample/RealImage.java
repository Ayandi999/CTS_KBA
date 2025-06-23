package Design_Patterns.ProxyPatternExample;

public class RealImage implements Image {
     private String filename;

     public RealImage(String filename) {
          this.filename = filename;
          loadFromRemoteServer(); // Simulate expensive loading
     }

     private void loadFromRemoteServer() {
          System.out.println("Loading image from server: " + filename);
     }

     public void display() {
          System.out.println("Displaying image: " + filename);
     }
}
