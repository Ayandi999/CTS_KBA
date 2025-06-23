package Design_Patterns.FactoryMethodattern;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}
