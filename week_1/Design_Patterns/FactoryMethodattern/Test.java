package Design_Patterns.FactoryMethodattern;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory;

        System.out.println("=== Document Creator ===");
        System.out.print("Enter document type (word/pdf/excel): ");
        String type = scanner.nextLine().toLowerCase();

        switch (type) {
            case "word":
                factory = new WordDocumentFactory();
                break;
            case "pdf":
                factory = new PdfDocumentFactory();
                break;
            case "excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Invalid type.");
                scanner.close();
                return;
        }

        Document doc = factory.createDocument();
        doc.open();

        scanner.close();
    }
}
