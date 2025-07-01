public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the dependency into the service
        CustomerService service = new CustomerService(repository);

        // Use the service
        service.displayCustomer(101);
    }
}