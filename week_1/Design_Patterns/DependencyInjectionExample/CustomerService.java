package Design_Patterns.DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void findAndPrintCustomer(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Lookup Result: " + customer);
    }
}
