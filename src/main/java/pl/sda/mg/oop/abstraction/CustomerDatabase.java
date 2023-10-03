package pl.sda.mg.oop.abstraction;

public class CustomerDatabase implements CustomerRepository{
    @Override
    public String fetchCustomerAddress(String lastName) {
        return String.format("Customer %s address from database: Warszawa, Marszałkowska 1", lastName);
    }

    @Override
    public void addCustomer(String lastName) {
        System.out.println(String.format("Customer %s saved in database successfully.", lastName));
    }
}
