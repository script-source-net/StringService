import connectors.DatabaseConnector;
import controller.Customer;
import controller.UserMenu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);
    int chooseOption;

    public CustomerManagement() throws SQLException {
        ArrayList<Customer> cList = new ArrayList();
        DatabaseConnector con = new DatabaseConnector();
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
                    Customer cust = createCustomer(lastName,firstName);
                    cList.add(cust);
                    break;
                case 2:
                    System.out.println(UserMenu.chooseCustomer);
                    break;
                case 3:
                    String selCustomers = "SELECT * FROM tbl_customers;";
                    ArrayList<Customer> customerList = con.SelectCustomers(selCustomers);
                    for (Customer c : customerList){
                        System.out.printf("%d %s %s %s %s %s %s%n",
                                customerList.indexOf(c),
                                c.getLastname(),
                                c.getFirstname(),
                                c.getCustomerAdresse(),
                                c.getCustomerAdresseNr(),
                                c.getCustomerMail(),
                                c.getCustomerPhone());
                    }
                    /*
                    for(Customer customer : cList){
                        System.out.println(cList.indexOf(customer) + " " + customer.getLastname()+ " " + customer.getFirstname());
                    }
                     */
                    break;
                case 4:
                    String customers = "";
                    for(Customer customer : cList){
                        customers += "('" + customer.getLastname() + "','" + customer.getFirstname() + "'),";
                    }
                    String table = "tbl_customers (customers_lastname, customers_firstname) Values ";
                    con.InsertValuesToTable(customers,"tbl_customers");
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
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
