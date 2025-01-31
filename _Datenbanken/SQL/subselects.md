# Subselects in SQL 

Subselects (auch als Unterabfragen bekannt) sind SQL-Abfragen, die innerhalb einer anderen SQL-Abfrage eingebettet sind. Eine Subselect-Abfrage kann in den `SELECT`, `FROM`, `WHERE` oder `HAVING`-Klauseln verwendet werden und liefert Ergebnisse, die von der äußeren Abfrage weiterverarbeitet werden.

Arten von Subselects:

- Subselect in der `SELECT`-Klausel: Ein Subselect liefert einen Wert, der in einer Spalte des Ergebnisses verwendet wird.
- Subselect in der `WHERE`-Klausel: Ein Subselect wird verwendet, um Bedingungen zu definieren (z.B. durch Vergleich mit einem Wert aus der Unterabfrage).
- Subselect in der `FROM`-Klausel: Ein Subselect wird als eine temporäre Tabelle behandelt, aus der in der äußeren Abfrage abgerufen werden kann.

Beispiel auf der `hospital.db`-Datenbank:

Hier sind einige Beispiele für Subselects, die auf der `hospital.db`-Datenbank von der Seite sql-practice.com ausgeführt werden können:

## SQL Subselects Beispiel

### Subselect in der `WHERE`-Klausel
Ein Subselect in der `WHERE`-Klausel kann verwendet werden, um eine Bedingung zu definieren, die auf dem Ergebnis einer anderen Abfrage basiert. Zum Beispiel möchten wir alle Patienten finden, die von einem bestimmten Arzt behandelt wurden.

```sql
SELECT first_name, last_name
FROM patients
WHERE patient_id IN (
    SELECT patient_id
    FROM admissions
    WHERE attending_doctor_id = 3
);
```
In diesem Beispiel wird eine Unterabfrage verwendet, um alle `patient_id`s zu finden, die in der Tabelle `admissions` mit dem Arzt `attending_doctor_id = 3` verknüpft sind. Die äußere Abfrage holt dann die Namen der Patienten, die zu diesen IDs gehören.

### Subselect in der SELECT-Klausel
Subselects können auch verwendet werden, um zusätzliche Informationen in der `SELECT`-Klausel abzurufen. Zum Beispiel möchten wir den Namen des Arztes für jeden Patienten anzeigen:

```sql
SELECT first_name, last_name,
       (SELECT CONCAT(first_name, ' ', last_name)
        FROM doctors
        WHERE doctor_id = a.attending_doctor_id) AS doctor_name
FROM patients p
JOIN admissions a ON p.patient_id = a.patient_id;
```
In diesem Fall wird die Subselect-Abfrage verwendet, um den Namen des Arztes zu ermitteln, der mit der `attending_doctor_id` in der `admissions`-Tabelle verknüpft ist.

### Subselect in der FROM-Klausel
Ein Subselect in der `FROM`-Klausel wird als eine temporäre Tabelle behandelt, aus der dann in der äußeren Abfrage Daten abgerufen werden können. Zum Beispiel möchten wir alle Ärzte und die Anzahl der Patienten anzeigen, die sie behandelt haben:
```sql
SELECT doctor_name, COUNT(*) AS patient_count
FROM (
    SELECT DISTINCT d.first_name || ' ' || d.last_name AS doctor_name, a.patient_id
    FROM admissions a
    JOIN doctors d ON a.attending_doctor_id = d.doctor_id
) AS doctor_patient_counts
GROUP BY doctor_name;
```
Hier wird ein Subselect verwendet, um eine temporäre Tabelle mit den Namen der Ärzte und den jeweiligen patient_ids zu erstellen. Die äußere Abfrage zählt dann, wie viele Patienten jeder Arzt behandelt hat.

## Fazit
Subselects sind ein mächtiges Werkzeug, um komplexe Datenabfragen in SQL durchzuführen, indem sie es ermöglichen, Abfragen innerhalb anderer Abfragen zu schachteln. Sie sind besonders nützlich, wenn du Bedingungen oder Berechnungen auf Basis von Werten aus anderen Tabellen oder Unterabfragen durchführen möchtest.
