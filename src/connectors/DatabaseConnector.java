package connectors;


import controller.Customer;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {

    public DatabaseConnector() {
        DatabaseData conData = new DatabaseData();
        try (Connection con = DriverManager.getConnection(
                DatabaseData.getURL(),
                DatabaseData.getUSER(),
                DatabaseData.getPASSWORD())
        ) {
            System.out.println("Connection OK");
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }
    }

    public void InsertValuesToTable(String values, String table) {
        String prepare = "INSERT INTO ";
        String prepTable = table;
        String prepValues = values;
    }

    public ArrayList SelectCustomers(String select) {
        ArrayList<Customer> retSelect = new ArrayList<>();
        DatabaseData conData = new DatabaseData();
        ResultSet resultset = null;
        try (Connection con = DriverManager.getConnection(
                DatabaseData.getURL(),
                DatabaseData.getUSER(),
                DatabaseData.getPASSWORD())
        ) {
            System.out.println("Connection OK");
            Statement statement = con.createStatement();
            resultset = statement.executeQuery(select);
            while (resultset.next()) {
                retSelect.add(new Customer(resultset.getInt("customers_id"),
                        resultset.getString("customers_lastname"),
                        resultset.getString("customers_firstname"),
                        resultset.getInt("customers_phone"),
                        resultset.getString("customers_mail"),
                        resultset.getString("customers_adresse"),
                        resultset.getString("customers_adresse_nr"),
                        resultset.getString("city_plz"),
                        resultset.getString("city_name")));
            }
            return retSelect;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }
        return retSelect;
    }
}
