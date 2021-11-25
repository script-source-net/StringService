package test;

import controller.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.beans.Expression;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void CreateNewUserSetsLastnameFirstname(){
        Customer newCustomer = new Customer("Desax", "Gion");
        String lastname = newCustomer.getLastname();
        String firstname = newCustomer.getFirstname();
        Assertions.assertNotNull(lastname);
        Assertions.assertNotNull(firstname);
    }

}