import controller.Customer;
import controller.UserMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    int chooseOption;

    public static void main(String[] args) {
        new CustomerManagement();
    }

    CustomerManagement(){
        ArrayList<Customer> cList = new ArrayList();
        boolean runApp = true;
        while (runApp) {
            System.out.println(UserMenu.customerManagementMenu);
            int cmMenu = sc.nextInt();
            switch (cmMenu){
                case 1:
                    System.out.println(UserMenu.newCustomerLastName);
                    String lastName = sc.next();
                    System.out.println(UserMenu.newCustomerFirstName);
                    String firstName = sc.next();
                    Customer c = createCustomer(lastName,firstName);
                    cList.add(c);
                    break;
                case 2:
                    System.out.println(UserMenu.chooseCustomer);
                    break;
                case 3:
                    for(Customer customer : cList){
                        System.out.println(cList.indexOf(customer) + " " + customer.getLastname()+ " " + customer.getFirstname());
                    }
                    break;
                case 4:
                    runApp = false;
                    break;
                default:
                    System.out.println("Diese Eingabe ist nicht korrekt");
                    break;
            }
        }



    }



    public Customer createCustomer(String lastName, String firstName){
        return new Customer(lastName, firstName);
    }

}
