package pl.sda.mg.oop.abstraction;

public class ExternalService implements CustomerRepository{
    @Override
    public String fetchCustomerAddress(String lastName) {
        return String.format("Customer %s address from external service: Łódź, Piotrkowska 1", lastName);
    }

    @Override
    public void addCustomer(String lastName) {

    }
}
