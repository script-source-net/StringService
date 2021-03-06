package controller;

public class Customer extends Person{
    int customerNumber = 0;
    int customerPhone = 0;
    int customerPLZ;
    String customerMail, customerAdresse,customerAdresseNr, customerCity;
    public Customer(){

    }
    public Customer (String lastName, String firstName){
        this.setFirstname(firstName);
        this.setLastname(lastName);
    }
    public Customer (int customerID, String lastName, String firstName,int customerPhone,String customerMail, String customerAdresse, String customerAdresseNr, int customerPLZ, String customerCity){
        this.setCustomerNumber(customerID);
        this.setFirstname(firstName);
        this.setLastname(lastName);
        this.setCustomerPhone(customerPhone);
        this.setCustomerAdresse(customerAdresse);
        this.setCustomerAdresseNr(customerAdresseNr);
        this.setCustomerMail(customerMail);
        this.setCustomerCity(customerCity);
        this.setCustomerPLZ(customerPLZ);
    }
    public Customer (String lastName, String firstName,int customerPhone,String customerMail, String customerAdresse, String customerAdresseNr, int customerPLZ, String customerCity){
        this.setFirstname(firstName);
        this.setLastname(lastName);
        this.setCustomerPhone(customerPhone);
        this.setCustomerAdresse(customerAdresse);
        this.setCustomerAdresseNr(customerAdresseNr);
        this.setCustomerMail(customerMail);
        this.setCustomerCity(customerCity);
        this.setCustomerPLZ(customerPLZ);
    }

    public Customer (int customerID, String lastName, String firstName){
        this.setCustomerNumber(customerID);
        this.setFirstname(firstName);
        this.setLastname(lastName);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public Customer setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public Customer setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
        return this;
    }

    public String getCustomerAdresse() {
        return customerAdresse;
    }

    public Customer setCustomerAdresse(String customerAdresse) {
        this.customerAdresse = customerAdresse;
        return this;
    }

    public String getCustomerAdresseNr() {
        return customerAdresseNr;
    }

    public Customer setCustomerAdresseNr(String customerAdresseNr) {
        this.customerAdresseNr = customerAdresseNr;
        return this;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public Customer setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public int getCustomerPLZ() {
        return customerPLZ;
    }

    public void setCustomerPLZ(int customerPLZ) {
        this.customerPLZ = customerPLZ;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }
}
