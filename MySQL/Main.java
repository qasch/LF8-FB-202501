import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String url = "jdbc:mysql://localhost:3306/testdb";
    static String user = "kai";
    static String password = "secure_password";
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung erfolgreich");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
