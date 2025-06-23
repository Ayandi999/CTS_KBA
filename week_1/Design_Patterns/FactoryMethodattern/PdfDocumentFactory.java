package Design_Patterns.FactoryMethodattern;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return (Document) new PdfDocument();
    }
}
