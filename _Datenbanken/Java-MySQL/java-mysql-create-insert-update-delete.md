# Java und MySQL – Beispiele zur Datenbankanbindung

In dieser Anleitung zeige ich dir, wie du mit Java eine MySQL-Datenbank ansprechen kannst. Die Beispiele beinhalten:

- Erstellung einer MySQL-Datenbank
- Rechtevergabe
- Verbindung zu MySQL mit Java
- Einfügen, Aktualisieren, Löschen und Abfragen von Daten

## 1. Datenbank erstellen und Benutzerrechte vergeben

Bevor du mit Java auf MySQL zugreifst, erstelle eine Datenbank und einen Benutzer mit den entsprechenden Rechten.

```sql
-- Datenbank erstellen
CREATE DATABASE example_db;

-- Benutzer erstellen und Rechte vergeben
CREATE USER 'java_user'@'localhost' IDENTIFIED BY 'securepassword';
GRANT ALL PRIVILEGES ON example_db.* TO 'java_user'@'localhost';
FLUSH PRIVILEGES;
```

## 2. Java-Programm zur Verbindung mit MySQL

Installiere den MySQL JDBC-Treiber und stelle sicher, dass er im CLASSPATH enthalten ist.

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db";
        String user = "java_user";
        String password = "securepassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung erfolgreich!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## 3. Daten in die Datenbank einfügen (INSERT)

```java
import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db";
        String user = "java_user";
        String password = "securepassword";
        
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "Max Mustermann");
            stmt.setString(2, "max@example.com");
            stmt.executeUpdate();
            System.out.println("Daten erfolgreich eingefügt!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## 4. Daten aktualisieren (UPDATE)

```java
public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db";
        String user = "java_user";
        String password = "securepassword";
        
        String sql = "UPDATE users SET email = ? WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "newemail@example.com");
            stmt.setString(2, "Max Mustermann");
            stmt.executeUpdate();
            System.out.println("Daten erfolgreich aktualisiert!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## 5. Daten löschen (DELETE)

```java
public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db";
        String user = "java_user";
        String password = "securepassword";
        
        String sql = "DELETE FROM users WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, "Max Mustermann");
            stmt.executeUpdate();
            System.out.println("Daten erfolgreich gelöscht!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## 6. Daten abrufen (SELECT)

```java
public class SelectData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/example_db";
        String user = "java_user";
        String password = "securepassword";
        
        String sql = "SELECT * FROM users";
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

