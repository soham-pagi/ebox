import java.util.ArrayList;
import java.util.List;

class CustomerBO {

    private List<Customer> allCustomers;

    public CustomerBO(List<Customer> allCustomers) {
        this.allCustomers = allCustomers;
    }

    //Fill your code here

    public void appendCustomer(String customerDetails, List<Customer> customerList) {
        String[] c = customerDetails.split(",");
        Customer newCustomer = new Customer(Integer.parseInt(c[0].trim()), c[1].trim(), c[2].trim(), c[3].trim());
        customerList.add(newCustomer);
        System.out.println("Customer added successfully");
    }

    public void displayCustomers(List<Customer> customerList) {
        System.out.println("Customer Details");

        if (customerList.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }

        String title = String.format("%-10s%-15s%-25s%-15s", "id", "name", "email", "phoneNO");
        System.out.println(title);

        for (Customer x : customerList) {
            System.out.println(x);
        }
    }

    public Customer searchForCustomer(String email, List<Customer> customerList) {
        for (Customer x : customerList) {
            if (x.getEmail().equals(email)) {
                System.out.println("Customer Details");
                String title = String.format("%-10s%-15s%-25s%-15s", "id", "name", "email", "phoneNO");
                System.out.println(title);
                System.out.println(x);
                return x;
            }
        }

        System.out.println("No customer found with the given e-mail id");
        return new Customer();
    }

    public void modifyCustomerDetailsById(int id, String email, List<Customer> customerList) {
        for (Customer x : customerList) {
            if (x.getId() == id) {
                x.setEmail(email.trim());
                System.out.println("Updated Successfully!");
                return;
            }
        }

        System.out.println("No customer found with this Id!");
    }

    public void updateCustomerPhoneByID(int id, String phoneNumber, List<Customer> customerList) {
        for (Customer x : customerList) {
            if (x.getId() == id) {
                x.setPhoneNO(phoneNumber.trim());
                System.out.println("Updated Successfully!");
                return;
            }
        }

        System.out.println("No customer found with this Id!");
    }

    public List<Customer> getAllCustomerDetails() {
        //Fill your code here
        return allCustomers;
    }
}
