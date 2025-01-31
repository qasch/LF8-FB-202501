# DELETE und DROP in MySQL

In MySQL werden `DELETE` und `DROP` verwendet, um Daten oder ganze Tabellen zu entfernen. Beide haben unterschiedliche Anwendungsfälle und sollten mit Vorsicht genutzt werden.

## 1️⃣ DELETE – Datensätze löschen
Das `DELETE`-Statement entfernt bestimmte Zeilen aus einer Tabelle, basierend auf einer Bedingung.

### 📌 Grundlegende Syntax
```sql
DELETE FROM tabelle WHERE bedingung;
```
- `tabelle` ist die Tabelle, aus der Zeilen entfernt werden.
- `WHERE bedingung` bestimmt, welche Zeilen gelöscht werden.

### 📌 Beispiel
Gegeben sei die Tabelle `customers`:

```sql
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
```

Löschen eines Kunden mit `id = 3`:

```sql
DELETE FROM customers WHERE id = 3;
```

### ❗ Vorsicht: Ohne `WHERE` werden **alle Zeilen gelöscht**!
```sql
DELETE FROM customers;
```

Um die `id`-Zählung zurückzusetzen (nur bei `AUTO_INCREMENT` sinnvoll):
```sql
ALTER TABLE customers AUTO_INCREMENT = 1;
```

## 2️⃣ DROP – Tabellen oder Datenbanken löschen
Das `DROP`-Statement entfernt eine gesamte Tabelle oder Datenbank **unwiderruflich**.

### 📌 Tabelle löschen
```sql
DROP TABLE customers;
```
❗ **Achtung:** Alle Daten und die Tabellenstruktur gehen verloren.

### 📌 Datenbank löschen
```sql
DROP DATABASE testdb;
```

## 3️⃣ Typische Fehlerquellen & Lösungen

### ❌ **Fehlende WHERE-Klausel bei DELETE**
```sql
DELETE FROM customers;
```
❌ Fehler: **Alle Kunden werden gelöscht!**
✅ Lösung:
```sql
DELETE FROM customers WHERE id = 5;
```

### ❌ **Falsche Tabelle bei DROP**
```sql
DROP TABLE orders;
```
❌ Fehler: Die Tabelle ist unwiderruflich entfernt.
✅ Lösung:
- Vorher prüfen:
```sql
SHOW TABLES;
```
- Alternativ nur leeren, aber Struktur behalten:
```sql
TRUNCATE TABLE orders;
```

## Fazit
- **`DELETE`** löscht einzelne Datensätze, **`DROP`** entfernt komplette Tabellen/Datenbanken.
- **Vorsicht beim Löschen ohne `WHERE`-Klausel!**
- Immer vorher Backups erstellen, um Datenverlust zu vermeiden.


