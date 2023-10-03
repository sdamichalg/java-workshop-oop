package pl.sda.mg.oop.abstraction;

public class AbstractionExampleApp {
    public static void main(String[] args) {
        CustomerRepository repository = new ExternalService();
        CustomerService customerService = new CustomerService(repository);

        String customerAddress = customerService.getCustomerAddress("Kowalski");
        System.out.println(customerAddress);

    }
}
