package controller;

public class Customer extends Person{
    int customerNumber = 0;
    String customerMail, customerAdresse, customerAdresseNr, customerPhone;
    public Customer(){

    }
    public Customer (String lastName, String firstName){
        this.setFirstname(firstName);
        this.setLastname(lastName);
    }
    public Customer (String lastName, String firstName,String customerPhone,String customerMail, String customerAdresse, String customerAdresseNr){
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public Customer setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }
}
