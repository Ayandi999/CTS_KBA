package Design_Patterns.DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customerData;

    public CustomerRepositoryImpl() {
        customerData = new HashMap<>();
        // Sample data
        customerData.put("101", "Alice");
        customerData.put("102", "Bob");
        customerData.put("103", "Charlie");
    }

    @Override
    public String findCustomerById(String id) {
        return customerData.getOrDefault(id, "Customer not found");
    }
}
