package connectors;

public class DatabaseData {
    private final static String URL = "jdbc:mysql://webdev.script-source.net:3306/script-source.net";
    private final static String USER ="javasql";
    private final static String PASSWORD ="*P3(vJlhEV[yeD(2";

    public static String getURL() {return URL;}
    public static String getUSER(){return USER;}
    public static String getPASSWORD() {return PASSWORD;}
}
