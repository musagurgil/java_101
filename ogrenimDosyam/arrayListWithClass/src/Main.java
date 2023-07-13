import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer musa = new Customer(1, "Musa", "Gürgil");
        customers.add(new Customer(2, "Ceren", "Gürgil"));

        customers.remove(musa);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
