package controller;

public interface SQL_Statements {

    String insertCustomers = "INSERT into tbl_customers"+
        "(customers_lastname, customers_firstname, customers_phone, customers_mail, customers_adresse, customers_adresse_nr, city_id)" +
            "VALUES" +
            "(?,?,?,?,?,?,?);";
    String selectCityID = "SELECT city_id FROM tbl_cities WHERE city_name LIKE ? AND city_plz = ?;";
    String selectCustomers = "SELECT t.customers_id," +
            "       t.customers_firstname," +
            "       t.customers_lastname," +
            "       t.customers_adresse," +
            "       t.customers_adresse_nr," +
            "       tc.city_plz," +
            "       tc.city_name," +
            "       t.customers_mail," +
            "       t.customers_phone " +
            "FROM `script-source.net`.tbl_customers t " +
            "INNER JOIN tbl_cities tc on t.city_id = tc.city_id;";
    String selectCustomerShortList = "SELECT t.customers_id," +
            "       t.customers_lastname," +
            "       t.customers_firstname " +
            "FROM `script-source.net`.tbl_customers t;";

    String updateCustomerByID ="UPDATE tbl_customers " +
            "SET customers_lastname = ?," +
            "    customers_firstname = ?," +
            "    customers_phone = ?," +
            "    customers_mail = ?," +
            "    customers_adresse = ?," +
            "    customers_adresse_nr = ?," +
            "    city_id = ? " +
            "WHERE customers_id = ?;";

    String selectCustomerByID = "SELECT t.customers_lastname," +
            "       t.customers_firstname," +
            "       t.customers_phone," +
            "       t.customers_mail," +
            "       t.customers_adresse," +
            "       t.customers_adresse_nr," +
            "       tc.city_plz," +
            "       tc.city_name " +
            "FROM tbl_customers t " +
            "INNER JOIN tbl_cities tc on t.city_id = tc.city_id " +
            "WHERE customers_id = ?;";

    String deleteCustomerByID = "DELETE FROM tbl_customers WHERE customers_id = ?;";
}
