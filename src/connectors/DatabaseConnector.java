package connectors;


import controller.Customer;
import controller.SQL_Statements;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector implements SQL_Statements {

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

    public void InsertCustomer(Customer customer) {
        try (Connection con = DriverManager.getConnection(
                DatabaseData.getURL(),
                DatabaseData.getUSER(),
                DatabaseData.getPASSWORD())
        ){
            System.out.println("Connection OK");
            PreparedStatement ps = con.prepareStatement(selectCityID);
            ps.setString(1,customer.getCustomerCity());
            ps.setInt(2,customer.getCustomerPLZ());
            ResultSet rs = ps.executeQuery();
            int city_id =0;
            while (rs.next()){
                city_id = rs.getInt("city_id");
            }
            PreparedStatement prepStmt = con.prepareStatement(insertCustomers);
            prepStmt.setString(1,customer.getLastname());
            prepStmt.setString(2, customer.getFirstname());
            prepStmt.setInt(3, customer.getCustomerPhone());
            prepStmt.setString(4, customer.getCustomerMail());
            prepStmt.setString(5,customer.getCustomerAdresse());
            prepStmt.setString(6,customer.getCustomerAdresseNr());
            prepStmt.setInt(7,city_id);
            prepStmt.execute();
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }


    }

    public ArrayList SelectCustomers(String select) {
        ArrayList<Customer> retSelect = new ArrayList<>();
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
                        resultset.getInt("city_plz"),
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

    public ArrayList SelectCustomer2Change(String select) {
        ArrayList<Customer> retSelect = new ArrayList<>();
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
                        resultset.getString("customers_firstname")));
            }
            return retSelect;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }
        return retSelect;
    }
    public void UpdateCustomer(Customer customer,int customer_id){
        try (Connection con = DriverManager.getConnection(
                DatabaseData.getURL(),
                DatabaseData.getUSER(),
                DatabaseData.getPASSWORD())
        ){
            System.out.println("Connection OK");
            PreparedStatement ps = con.prepareStatement(selectCityID);
            ps.setString(1,customer.getCustomerCity());
            ps.setInt(2,customer.getCustomerPLZ());
            ResultSet rs = ps.executeQuery();
            int city_id =0;
            while (rs.next()){
                city_id = rs.getInt("city_id");
            }
            PreparedStatement prepStmt = con.prepareStatement(updateCustomerByID);
            prepStmt.setString(1,customer.getLastname());
            prepStmt.setString(2, customer.getFirstname());
            prepStmt.setInt(3, customer.getCustomerPhone());
            prepStmt.setString(4, customer.getCustomerMail());
            prepStmt.setString(5,customer.getCustomerAdresse());
            prepStmt.setString(6,customer.getCustomerAdresseNr());
            prepStmt.setInt(7,city_id);
            prepStmt.setInt(8,customer_id);
            prepStmt.executeUpdate();
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }
    }

    public void DeleteCustomer(int customerID){
        try (Connection con = DriverManager.getConnection(
                DatabaseData.getURL(),
                DatabaseData.getUSER(),
                DatabaseData.getPASSWORD())
        ){
            System.out.println("Connection OK");
            PreparedStatement ps = con.prepareStatement(deleteCustomerByID);
            ps.setInt(1,customerID);
            ps.execute();
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Connection NOK");
            e.printStackTrace();
        }
    }
}
