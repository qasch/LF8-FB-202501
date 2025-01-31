# UPDATE in MySQL

Das `UPDATE`-Statement in MySQL wird verwendet, um bestehende Datensätze in einer Tabelle zu ändern.

## 1️⃣ Grundlegende Syntax
Die grundlegende Syntax eines `UPDATE`-Statements lautet:

```sql
UPDATE tabelle SET spalte1 = wert1, spalte2 = wert2 WHERE bedingung;
```

- `tabelle` ist die Tabelle, deren Daten aktualisiert werden sollen.
- `spalte1 = wert1, spalte2 = wert2` gibt die zu ändernden Spalten und deren neue Werte an.
- `WHERE bedingung` legt fest, welche Zeilen geändert werden.

### Beispiel:
Gegeben sei die Tabelle `customers`:

```sql
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);
```

Ändern der E-Mail-Adresse eines bestimmten Kunden:

```sql
UPDATE customers SET email = 'newemail@example.com' WHERE id = 1;
```

## 2️⃣ Mehrere Spalten gleichzeitig aktualisieren
Man kann mehrere Spalten in einem einzigen `UPDATE`-Befehl ändern:

```sql
UPDATE customers SET name = 'Max Mustermann', age = 35 WHERE id = 2;
```

## 3️⃣ Alle Zeilen einer Tabelle aktualisieren
Wenn keine `WHERE`-Klausel angegeben wird, werden **alle** Zeilen der Tabelle aktualisiert:

```sql
UPDATE customers SET age = age + 1;
```

⚠️ **Achtung:** Ohne `WHERE` wird jede Zeile geändert, was oft unerwünscht ist.

## 4️⃣ UPDATE mit Unterabfrage
Man kann eine `UPDATE`-Anweisung mit einer Unterabfrage kombinieren:

```sql
UPDATE customers SET age = (SELECT AVG(age) FROM customers) WHERE id = 3;
```

## 5️⃣ Typische Fehlerquellen & Lösungen

### ❌ **Vergessen der WHERE-Klausel**
```sql
UPDATE customers SET age = 40;
```
❌ Fehler: **Alle** Zeilen in der Tabelle werden auf `age = 40` gesetzt.
✅ Lösung:
```sql
UPDATE customers SET age = 40 WHERE id = 3;
```

### ❌ **Datentyp-Fehler**
```sql
UPDATE customers SET age = 'vierzig' WHERE id = 1;
```
❌ Fehler: Der Wert `'vierzig'` ist kein Integer.
✅ Lösung:
```sql
UPDATE customers SET age = 40 WHERE id = 1;
```

### ❌ **Falsche Bedingung in WHERE**
```sql
UPDATE customers SET email = 'test@example.com' WHERE name = 'Nicht Vorhanden';
```
❌ Fehler: Die Bedingung trifft auf keine Zeile zu, es wird nichts aktualisiert.
✅ Lösung:
- Überprüfen, ob der Wert in der `WHERE`-Bedingung existiert.
- Alternativ mit `SELECT` vorab prüfen:

```sql
SELECT * FROM customers WHERE name = 'Nicht Vorhanden';
```

## Fazit
`UPDATE` ist ein mächtiges Werkzeug zur Aktualisierung von Daten in MySQL. Eine **sorgfältige Verwendung von `WHERE`** ist essenziell, um unbeabsichtigte Änderungen zu vermeiden.


