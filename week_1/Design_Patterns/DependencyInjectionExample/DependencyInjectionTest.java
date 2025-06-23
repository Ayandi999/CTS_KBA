package Design_Patterns.DependencyInjectionExample;

import java.util.Scanner;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inject dependency via constructor
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        System.out.println("=== Customer Lookup System ===");
        System.out.print("Enter customer ID: ");
        String id = scanner.nextLine();

        service.findAndPrintCustomer(id);

        scanner.close();
    }
}
