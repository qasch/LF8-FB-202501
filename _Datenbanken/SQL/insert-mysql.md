# INSERT in MySQL

Das `INSERT`-Statement in MySQL dient dazu, neue Datensätze in eine Tabelle einzufügen. Es gibt verschiedene Varianten von `INSERT`, die je nach Anwendungsfall eingesetzt werden können.

## 1️⃣ Grundlegende Syntax
Die einfachste Form von `INSERT` lautet:

```sql
INSERT INTO tabelle (spalte1, spalte2, spalte3) VALUES (wert1, wert2, wert3);
```

- `tabelle` ist die Ziel-Tabelle, in die die Daten eingefügt werden.
- `spalte1, spalte2, spalte3` sind die Spalten, in die Werte eingefügt werden.
- `wert1, wert2, wert3` sind die einzufügenden Werte.

### Beispiel:
Angenommen, wir haben eine Tabelle `customers`:

```sql
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);
```

Einfügen eines neuen Kunden:

```sql
INSERT INTO customers (name, email, age) VALUES ('Max Mustermann', 'max@example.com', 30);
```

## 2️⃣ Mehrere Zeilen gleichzeitig einfügen
Statt mehrere `INSERT`-Befehle zu schreiben, kann man mehrere Zeilen gleichzeitig einfügen:

```sql
INSERT INTO customers (name, email, age) VALUES
('Anna Schmidt', 'anna@example.com', 25),
('Peter Müller', 'peter@example.com', 40);
```

## 3️⃣ Automatische Werte mit `DEFAULT`
Falls eine Spalte einen Standardwert hat oder `AUTO_INCREMENT` verwendet wird, kann `DEFAULT` genutzt werden:

```sql
INSERT INTO customers (name, email, age) VALUES ('Lisa Becker', DEFAULT, 28);
```

Hier wird für `email` der Standardwert (`NULL` oder der definierte Default-Wert) gesetzt.

## 4️⃣ INSERT mit `SELECT`
Man kann Daten aus einer anderen Tabelle einfügen:

```sql
INSERT INTO customers (name, email, age)
SELECT name, email, age FROM old_customers WHERE age > 30;
```

## 5️⃣ Typische Fehlerquellen & Lösungen

### ❌ **Fehlende oder falsche Spaltenangabe**
```sql
INSERT INTO customers VALUES ('Max', 'max@example.com', 30);
```
❌ Fehler: Die `id`-Spalte fehlt oder wird nicht automatisch befüllt.
✅ Lösung:
```sql
INSERT INTO customers (name, email, age) VALUES ('Max', 'max@example.com', 30);
```

### ❌ **Datentyp-Fehler**
```sql
INSERT INTO customers (name, email, age) VALUES ('Tom', 'tom@example.com', 'dreißig');
```
❌ Fehler: Der Wert `'dreißig'` ist kein Integer.
✅ Lösung:
```sql
INSERT INTO customers (name, email, age) VALUES ('Tom', 'tom@example.com', 30);
```

### ❌ **Primärschlüssel-Doppelung**
```sql
INSERT INTO customers (id, name, email, age) VALUES (1, 'Alice', 'alice@example.com', 22);
```
❌ Fehler: Die `id=1` existiert bereits.
✅ Lösung:
- `AUTO_INCREMENT` nutzen oder prüfen, ob die ID bereits vorhanden ist.
- `INSERT IGNORE` oder `REPLACE` verwenden, um Konflikte zu umgehen.

## Fazit
`INSERT` ist ein grundlegender SQL-Befehl zum Einfügen neuer Daten in Tabellen. Durch die richtige Verwendung von Spaltenangaben, Datentypen und Standardwerten lassen sich typische Fehler vermeiden.


