package pl.sda.mg.oop.abstraction;

public class CustomerService {

    private final CustomerRepository customerRepository; //kompozycja

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerAddress(String lastName) {
        return customerRepository.fetchCustomerAddress(lastName);
    }
}
