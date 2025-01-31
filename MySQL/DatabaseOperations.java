import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseOperations {
    public static void main(String[] args) {
        // JDBC URL für die Verbindung zur MySQL-Datenbank
        // Ersetze 'localhost' durch die IP-Adresse deines MySQL-Servers, falls notwendig
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "kai";        // Benutzername für den Zugriff auf die Datenbank
        String password = "secure_password";  // Passwort für den Benutzer

        // Versuchen, eine Verbindung zur MySQL-Datenbank herzustellen
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung erfolgreich");

            // Tabelle erstellen, wenn sie noch nicht existiert
            createTable(conn);

            // Testdaten in die Tabelle einfügen
            insertData(conn);

            // Alle Daten aus der Tabelle anzeigen
            selectData(conn);

            // Ein Update der Daten (z. B. das Alter eines Benutzers ändern)
            updateData(conn);

            // Alle Daten nach dem Update erneut anzeigen
            selectData(conn);

            // Daten eines Benutzers löschen
            deleteData(conn);

            // Alle Daten nach dem Löschen erneut anzeigen
            selectData(conn);

        } catch (SQLException e) {
            // Fehlerbehandlung, falls die Verbindung oder eine SQL-Anweisung fehlschlägt
            e.printStackTrace();
        }
    }

    // Methode zum Erstellen der Tabelle 'users'
    public static void createTable(Connection conn) {
        // SQL-Statement zum Erstellen der Tabelle, falls sie noch nicht existiert
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +  // Automatisch inkrementierende ID als Primärschlüssel
                "name VARCHAR(100), " +  // Spalte für den Namen des Benutzers
                "age INT)";  // Spalte für das Alter des Benutzers

        try (Statement stmt = conn.createStatement()) {
            // Ausführen der SQL-Anweisung zum Erstellen der Tabelle
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabelle 'users' erstellt.");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Erstellen der Tabelle fehlschlägt
            e.printStackTrace();
        }
    }

    // Methode zum Einfügen von Testdaten in die Tabelle 'users'
    public static void insertData(Connection conn) {
        // SQL-Statement für das Einfügen von Daten
        String insertSQL = "INSERT INTO users (name, age) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            // Einfügen der ersten Zeile mit dem Namen 'Kai' und dem Alter 28
            pstmt.setString(1, "Kai");
            pstmt.setInt(2, 44);
            pstmt.executeUpdate();

            // Einfügen der zweiten Zeile mit dem Namen 'Gretl' und dem Alter 25
            pstmt.setString(1, "Gretl");
            pstmt.setInt(2, 11);
            pstmt.executeUpdate();

            System.out.println("Daten eingefügt.");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Einfügen von Daten fehlschlägt
            e.printStackTrace();
        }
    }

    // Methode zum Anzeigen aller Daten aus der Tabelle 'users'
    public static void selectData(Connection conn) {
        // SQL-Statement zum Auswählen aller Daten aus der Tabelle
        String selectSQL = "SELECT * FROM users";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            System.out.println("Alle Benutzerdaten:");

            // Iteriere über alle Zeilen im ResultSet und zeige die Daten an
            while (rs.next()) {
                // Ausgabe der ID, des Namens und des Alters für jede Zeile
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Alter: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Abrufen der Daten fehlschlägt
            e.printStackTrace();
        }
    }

    // Methode zum Aktualisieren von Daten (z. B. das Alter von 'Kai' ändern)
    public static void updateData(Connection conn) {
        // SQL-Statement für das Aktualisieren von Daten
        String updateSQL = "UPDATE users SET age = ? WHERE name = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
            // Setze das Alter von 'Kai' auf 30
            pstmt.setInt(1, 45);
            pstmt.setString(2, "Kai");
            pstmt.executeUpdate();

            System.out.println("Daten aktualisiert.");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Aktualisieren von Daten fehlschlägt
            e.printStackTrace();
        }
    }

    // Methode zum Löschen von Daten (z. B. 'Gretl' aus der Tabelle entfernen)
    public static void deleteData(Connection conn) {
        // SQL-Statement für das Löschen von Daten
        String deleteSQL = "DELETE FROM users WHERE name = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
            // Lösche die Zeile, in der der Name 'Gretl' steht
            pstmt.setString(1, "Gretl");
            pstmt.executeUpdate();

            System.out.println("Daten gelöscht.");
        } catch (SQLException e) {
            // Fehlerbehandlung, falls das Löschen von Daten fehlschlägt
            e.printStackTrace();
        }
    }
}
