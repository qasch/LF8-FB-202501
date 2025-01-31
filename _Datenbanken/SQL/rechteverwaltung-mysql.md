# Rechteverwaltung in MySQL

In MySQL können Benutzer verschiedene Berechtigungen erhalten, um Datenbanken und Tabellen sicher zu verwalten. Die Rechteverwaltung erfolgt über die `GRANT`- und `REVOKE`-Befehle.

## 1️⃣ Benutzer anlegen
Ein neuer Benutzer kann mit folgendem Befehl erstellt werden:

```sql
CREATE USER 'testuser'@'localhost' IDENTIFIED BY 'securepassword';
```

- `'testuser'@'localhost'` definiert den Benutzernamen und die zulässige Herkunft (in diesem Fall nur lokal).
- `IDENTIFIED BY 'securepassword'` setzt das Passwort für den Benutzer.

## 2️⃣ Rechte vergeben (`GRANT`)
MySQL erlaubt die Vergabe spezifischer Rechte an Benutzer:

### 📌 Alle Rechte für eine bestimmte Datenbank:
```sql
GRANT ALL PRIVILEGES ON testdb.* TO 'testuser'@'localhost';
```

### 📌 Nur Lesezugriff auf eine Tabelle:
```sql
GRANT SELECT ON testdb.customers TO 'testuser'@'localhost';
```

### 📌 Rechte für das Ändern von Daten (`INSERT`, `UPDATE`, `DELETE`):
```sql
GRANT INSERT, UPDATE, DELETE ON testdb.orders TO 'testuser'@'localhost';
```

### 📌 Rechte für das Erstellen von Tabellen:
```sql
GRANT CREATE ON testdb.* TO 'testuser'@'localhost';
```

## 3️⃣ Rechte entziehen (`REVOKE`)
Einzelne Rechte können einem Benutzer wieder entzogen werden:

### 📌 Lesezugriff entziehen:
```sql
REVOKE SELECT ON testdb.customers FROM 'testuser'@'localhost';
```

### 📌 Alle Rechte entziehen:
```sql
REVOKE ALL PRIVILEGES ON testdb.* FROM 'testuser'@'localhost';
```

## 4️⃣ Benutzer löschen
Falls ein Benutzer nicht mehr benötigt wird, kann er entfernt werden:

```sql
DROP USER 'testuser'@'localhost';
```

## 5️⃣ Änderungen übernehmen
Nach Änderungen an den Berechtigungen sollte dieser Befehl ausgeführt werden:

```sql
FLUSH PRIVILEGES;
```

## Fazit
Die MySQL-Rechteverwaltung ermöglicht eine feingranulare Kontrolle über Benutzerzugriffe und schützt die Datenbank vor unautorisierten Änderungen. Durch den gezielten Einsatz von `GRANT` und `REVOKE` können individuelle Berechtigungen verwaltet werden.


