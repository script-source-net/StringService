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

    String customerLastname = "Nachname: ";
    String customerFirstname = "Vorname: ";
    String customerAdresse = "Adresse: ";
    String customerAdresseNr = "Adresse Nr.: ";
    String customerPhone = "Telefon Nr.: ";
    String customerMail = "Mailadresse: ";
    String customerCityPostalCode = "PLZ: ";
    String customerCityName = "Ortschaft: ";
    String chooseCustomer = "Welcher Kunde soll angepasst werden?\n"+
            "(Kundennummer eingeben)";
    String changeCustomerData ="**********************************\n"+
            "Welche Daten sollen angepasst werden?\n" +
            "**********************************\n"+
            "[1] -> Alle Daten\n"+
            "[2] -> Nachname\n"+
            "[3] -> Vorname\n"+
            "[4] -> Adresse\n"+
            "[5] -> Adresse Nr\n"+
            "[6] -> PLZ\n"+
            "[7] -> Ortschaft\n"+
            "[8] -> Telefon Nr.\n"+
            "[9] -> Mailadresse\n"+
            "[10] -> zurück\n";
}
