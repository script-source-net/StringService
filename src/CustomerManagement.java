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
                    String selCustomers = "SELECT t.customers_id,\n" +
                            "       t.customers_firstname,\n" +
                            "       t.customers_lastname,\n" +
                            "       t.customers_adresse,\n" +
                            "       t.customers_adresse_nr,\n" +
                            "       tc.city_plz,\n" +
                            "       tc.city_name,\n" +
                            "       t.customers_mail,\n" +
                            "       t.customers_phone\n" +
                            "FROM `script-source.net`.tbl_customers t\n" +
                            "INNER JOIN tbl_cities tc on t.city_id = tc.city_id;";
                    ArrayList<Customer> customerList = con.SelectCustomers(selCustomers);
                    for (Customer c : customerList){
                        System.out.printf("**********************************\nKundennummer: %d\n%s %s\n%s %s\n%s %s\n%s\n+41%d%n\n",
                                c.getCustomerNumber(),
                                c.getLastname(),
                                c.getFirstname(),
                                c.getCustomerAdresse(),
                                c.getCustomerAdresseNr(),
                                c.getCustomerPLZ(),
                                c.getCustomerCity(),
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
