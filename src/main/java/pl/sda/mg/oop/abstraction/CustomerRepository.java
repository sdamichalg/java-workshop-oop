package pl.sda.mg.oop.abstraction;

public interface CustomerRepository {

    String fetchCustomerAddress(String lastName);
    void addCustomer(String lastName);

}
