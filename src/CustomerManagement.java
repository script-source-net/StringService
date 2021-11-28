import connectors.DatabaseConnector;
import controller.Customer;
import controller.SQL_Statements;
import controller.UserMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
    Scanner sc = new Scanner(System.in);

    public CustomerManagement(){
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
                    System.out.println(UserMenu.newCustomerAdresse);
                    String adresse = sc.next();
                    System.out.println(UserMenu.newCustomerAdresseNr);
                    String adresseNr = sc.next();
                    System.out.println(UserMenu.newCustomerCityPostalCode);
                    int plz = sc.nextInt();
                    System.out.println(UserMenu.newCustomerCityName);
                    String city_name = sc.next();
                    System.out.println(UserMenu.newCustomerPhone);
                    int phone = sc.nextInt();
                    System.out.println(UserMenu.newCustomerMail);
                    String mail = sc.next();
                    Customer cust = new Customer(lastName,firstName,phone,mail,adresse,adresseNr,plz,city_name);
                    con.InsertCustomer(cust);
                    break;
                case 2:
                    System.out.println(UserMenu.chooseCustomer);
                    break;
                case 3:
                    ArrayList<Customer> customerList = con.SelectCustomers(SQL_Statements.selectCustomers);
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

}
