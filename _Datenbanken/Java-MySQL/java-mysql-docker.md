# Java-Zugriff auf eine MySQL-Datenbank mit Docker

## 1️⃣ MySQL-Container mit Docker starten
Führe folgenden Befehl aus, um eine MySQL-Datenbank in Docker bereitzustellen:

```sh
docker run --name mysql-demo -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=testdb -p 3306:3306 -d mysql:latest
```

**Erläuterung:**

- `--name mysql-demo`: Vergibt einen Namen für den Container.
- `-e MYSQL_ROOT_PASSWORD=root`: Setzt das Root-Passwort.
- `-e MYSQL_DATABASE=testdb`: Erstellt eine Datenbank namens `testdb`.
- `-p 3306:3306`: Exponiert den MySQL-Port.
- `-d mysql:latest`: Startet MySQL als Hintergrundprozess.

## 2️⃣ Verbindung zu MySQL prüfen
Verbinde dich mit dem Container:
```sh
docker exec -it mysql-demo mysql -uroot -proot
```

Teste die Datenbank:
```sql
SHOW DATABASES;
USE testdb;
CREATE TABLE users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100));
INSERT INTO users (name) VALUES ('Alice'), ('Bob');
SELECT * FROM users;
```

## 3️⃣ Java-Projekt mit JDBC einrichten
### 📌 `pom.xml` (wenn du Maven verwendest)
```xml
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>
```

### 📌 `Main.java`
```java
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## 4️⃣ Programm ausführen
Starte dein Java-Programm, um die Daten aus MySQL abzurufen.

Mit dieser Methode kannst du den MySQL-Zugriff aus Java demonstrieren, ohne eine vollständige LAMP-Umgebung zu installieren. 🚀
