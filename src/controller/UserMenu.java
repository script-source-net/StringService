package controller;

public interface UserMenu {
    String startMenu = "**********************************\n"  +
                "String Service for Customers and Stringers\n" +
                "**********************************\n" +
                "[1] -> Kundenverwaltung\n" +
                "[2] -> Racketverwaltung\n" +
                "[3] -> Markenverwaltung\n" +
                "[4] -> Saitenverwaltung\n" +
                "[5] -> Auftragsverwaltung\n" +
                "[6] -> Systemeinstellungen\n" +
                "[7] -> Exit\n";

    String customerManagementMenu = "**********************************\n" +
                "Kundenverwaltung\n" +
                "**********************************\n" +
                "[1] -> Neuen Kunden erfassen\n" +
                "[2] -> Kundendaten anpassen\n" +
                "[3] -> Kundendaten ausgeben\n" +
                "[4] -> zurück\n";

    String newCustomerLastName= "Lastname: ";
    String newCustomerFirstName = "Firstname: ";
    String newCustomerAdresse = "Adresse: ";
    String newCustomerAdresseNr = "Adresse Nr.: ";
    String newCustomerPhone = "Phone Nr.: ";
    String newCustomerMail = "Mailadresse: ";
    String newCustomerCityPostalCode = "PLZ: ";
    String newCustomerCityName = "City Name: ";
    String chooseCustomer = "Welche Kundendaten wollen sie anpassen?";
}
