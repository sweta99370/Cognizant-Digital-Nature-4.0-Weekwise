public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulated database call
        return "Customer{id=" + id + ", name='Alice'}";
    }
}