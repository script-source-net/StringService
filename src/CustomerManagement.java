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
                    con.InsertCustomer(NewCustomer());
                    break;
                case 2:
                    ArrayList<Customer> cList = con.SelectCustomer2Change(SQL_Statements.selectCustomersChangeList);
                    for (Customer c : cList){
                        System.out.println("Kundennummer: " + c.getCustomerNumber() +
                                " | " + c.getLastname() +
                                " | " + c.getFirstname());
                    }
                    System.out.println(UserMenu.chooseCustomer);
                    int selectedCustomer = sc.nextInt();
                    con.UpdateCustomer(NewCustomer(),selectedCustomer);
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

    private Customer NewCustomer(){
        System.out.println(UserMenu.customerLastname);
        String lastName = sc.next();
        System.out.println(UserMenu.customerFirstname);
        String firstName = sc.next();
        System.out.println(UserMenu.customerAdresse);
        String adresse = sc.next();
        System.out.println(UserMenu.customerAdresseNr);
        String adresseNr = sc.next();
        System.out.println(UserMenu.customerCityPostalCode);
        int plz = sc.nextInt();
        System.out.println(UserMenu.customerCityName);
        String city_name = sc.next();
        System.out.println(UserMenu.customerPhone);
        int phone = sc.nextInt();
        System.out.println(UserMenu.customerMail);
        String mail = sc.next();
        return new Customer(lastName,firstName,phone,mail,adresse,adresseNr,plz,city_name);
    }

}
