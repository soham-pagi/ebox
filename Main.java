import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customerList = new ArrayList<>();
        CustomerBO customerBO = new CustomerBO(customerList);

        char choice;

        do {
            System.out.println("Menu\n1.Add Customer\n2.Display Customer\n3.Search Customer\n4.Edit Customer");
            System.out.println("Enter your choice: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("Enter the Customer details in CSV format");
                    String cDetailsCSV = scanner.nextLine();
                    customerBO.appendCustomer(cDetailsCSV, customerList);
                    break;

                case 2:
                    customerBO.displayCustomers(customerList);
                    break;

                case 3:
                    System.out.println("Enter e-mail id to search");
                    String emailToSearch = scanner.nextLine();
                    customerBO.searchForCustomer(emailToSearch, customerList);

                    break;

                case 4:
                    System.out.println("Enter the customer id to edit");
                    int idToEdit = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter updated E-Mail ID");
                    String emailToEdit = scanner.nextLine();

                    customerBO.modifyCustomerDetailsById(idToEdit, emailToEdit, customerList);
                    break;



                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Do you want to continue(y/n)?: ");
            choice = scanner.next().charAt(0);
        } while (Character.toLowerCase(choice) == 'y');

        System.out.println("Program exited.");
        scanner.close();
    }
}
