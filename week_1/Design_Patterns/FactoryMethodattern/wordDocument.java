package Design_Patterns.FactoryMethodattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}
