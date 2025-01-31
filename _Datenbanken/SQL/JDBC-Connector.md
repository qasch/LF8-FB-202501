# JDBC Connector zu einem IntelliJ-Projekt (MySQL) unter Windows manuell hinzufügen

In dieser Anleitung wird erklärt, wie man den *MySQL JDBC Connector* zu einem Java-Projekt in *IntelliJ IDEA* unter Windows hinzufügt.

## Voraussetzungen

- IntelliJ IDEA installiert
- Java Development Kit (JDK) auf deinem System installiert
- MySQL JDBC Connector (JAR-Datei) wird manuell heruntergeladen und hinzugefügt

### 1. MySQL JDBC Connector herunterladen
Gehe auf die offizielle MySQL-Website, um den JDBC Connector herunterzuladen: [https://dev.mysql.com/downloads/connector/j/](MySQL Connector/J Download)

Wähle die Windows-Version und klicke auf den Download-Link.

Du wirst auf eine Download-Seite weitergeleitet. Hier kannst du den ZIP-Archiv-Download wählen und die Datei auf deinem Computer speichern.

Entpacke das ZIP-Archiv, und du findest die JAR-Datei, die du in dein Projekt einbinden wirst. Die Datei sollte einen Namen wie `mysql-connector-java-8.0.x.jar` haben.

### 2. MySQL-Connector in IntelliJ IDEA zu deinem Projekt hinzufügen
Projekt öffnen: Starte IntelliJ IDEA und öffne dein Projekt (MySQL).

#### Projektstruktur öffnen:

Klicke auf File in der oberen Menüleiste und wähle Project Structure (oder drücke Ctrl+Alt+Shift+S).
Bibliotheken hinzufügen:

In der linken Spalte des Fensters Project Structure wähle den Menüpunkt Libraries.

Klicke auf das +-Zeichen in der oberen Mitte und wähle Java.

#### JDBC-Connector hinzufügen:

Navigiere zu dem Ordner, in dem du den heruntergeladenen und entpackten MySQL Connector gespeichert hast.

Wähle die JAR-Datei (mysql-connector-java-8.0.x.jar) und klicke auf OK.

##### Verbindung zum Projekt herstellen:

Nachdem du die JAR-Datei hinzugefügt hast, wähle dein Projekt aus und klicke auf Apply und dann OK.

### 3. MySQL JDBC Connector in deinem Code verwenden
Jetzt ist der JDBC Connector in deinem Projekt verfügbar, und du kannst ihn in deinem Java-Code verwenden.

Beispiel für eine einfache Verbindung zu einer MySQL-Datenbank:
``` java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        // JDBC URL, Benutzername und Passwort
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "kai";
        String password = "secure_password";

        try {
            // Verbindung zur Datenbank herstellen
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung erfolgreich!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
Stelle sicher, dass du die JDBC URL, den Benutzernamen und das Passwort für deine Datenbank korrekt einstellst.

### 4. Projekt ausführen
Speichere deinen Code und führe das Projekt aus.

IntelliJ sollte den JDBC Connector erkennen und korrekt in deinem Projekt verwenden.

### 5. Weitere Hinweise
MySQL Server: Stelle sicher, dass dein MySQL-Server läuft und die Verbindungseinstellungen (z. B. Host, Port, Datenbankname, Benutzername, Passwort) korrekt sind.

JDK-Version: Achte darauf, dass du eine geeignete Version des JDK verwendest, die mit deinem Projekt kompatibel ist.
