# SQL-Übungen für hospital.db

## 1. Einfache SELECT-Abfragen

### Alle Patienten anzeigen
```sql
SELECT * FROM patients;
```

### Nur Vor- und Nachnamen aller Patienten ausgeben
```sql
SELECT first_name, last_name FROM patients;
```

## 2. WHERE-Klausel mit Bedingungen

### Patienten aus einer bestimmten Stadt suchen
```sql
SELECT * FROM patients WHERE city = 'Berlin';
```

### Patienten mit Platzhaltern und LIKE suchen
```sql
SELECT * FROM patients WHERE last_name LIKE 'Schm%';
```

### Patienten ohne bekannte Allergien anzeigen (NULL-Werte beachten)
```sql
SELECT * FROM patients WHERE allergies IS NULL;
```

## 3. ORDER BY – Sortieren von Ergebnissen

### Patienten nach Geburtsdatum sortiert ausgeben
```sql
SELECT * FROM patients ORDER BY birth_date ASC;
```

## 4. Aggregatfunktionen

### Anzahl aller Patienten ermitteln
```sql
SELECT COUNT(*) FROM patients;
```

### Durchschnittliche Größe aller Patienten berechnen
```sql
SELECT AVG(height) FROM patients;
```

### Maximales Gewicht eines Patienten ermitteln
```sql
SELECT MAX(weight) FROM patients;
```

### Minimalgewicht eines Patienten ermitteln
```sql
SELECT MIN(weight) FROM patients;
```

### Summe aller Patientengewichte berechnen
```sql
SELECT SUM(weight) FROM patients;
```

## 5. GROUP BY – Gruppieren von Daten

### Anzahl der Patienten pro Stadt ermitteln
```sql
SELECT city, COUNT(*) FROM patients GROUP BY city;
```

### Durchschnittliches Gewicht pro Stadt berechnen
```sql
SELECT city, AVG(weight) FROM patients GROUP BY city;
```

### Patientenanzahl pro Bundesland anzeigen
```sql
SELECT province_id, COUNT(*) FROM patients GROUP BY province_id;
```

### Erklärung zu GROUP BY:
- `GROUP BY` gruppiert die Ergebnisse nach einer bestimmten Spalte.
- In Kombination mit Aggregatfunktionen können Gruppen zusammengefasst und analysiert werden.
- Ohne Aggregatfunktionen ist eine Gruppierung nicht sinnvoll.

## 6. JOINS – Verknüpfung von Tabellen

### Alle Patienten mit ihren behandelnden Ärzten anzeigen
```sql
SELECT patients.first_name, patients.last_name, doctors.first_name, doctors.last_name
FROM patients
JOIN admissions ON patients.patient_id = admissions.patient_id
JOIN doctors ON admissions.attending_doctor_id = doctors.doctor_id;
```

### Anzahl der Patienten pro Arzt ermitteln
```sql
SELECT doctors.first_name, doctors.last_name, COUNT(*) AS patient_count
FROM doctors
JOIN admissions ON doctors.doctor_id = admissions.attending_doctor_id
GROUP BY doctors.first_name, doctors.last_name;
```

## 7. Subqueries – Unterabfragen

### Arten von Subqueries:
- **Scalar Subquery**: Liefert genau einen Wert zurück (z. B. ein Durchschnitt oder Maximum).
- **Row Subquery**: Gibt genau eine Zeile mit mehreren Spalten zurück.
- **Table Subquery**: Kann mehrere Zeilen mit mehreren Spalten zurückgeben.
- **Correlated Subquery**: Eine Unterabfrage, die sich auf eine äußere Abfrage bezieht.

### Patienten anzeigen, die von einem bestimmten Arzt behandelt wurden
```sql
SELECT * FROM patients WHERE patient_id IN (
    SELECT patient_id FROM admissions WHERE attending_doctor_id = 3
);
```

### Durchschnittliche Patientenanzahl pro Arzt ermitteln
```sql
SELECT AVG(patient_count) FROM (
    SELECT attending_doctor_id, COUNT(*) AS patient_count
    FROM admissions
    GROUP BY attending_doctor_id
) AS subquery;
```

### Patienten, die in einer Stadt leben, in der mindestens 5 Patienten wohnen
```sql
SELECT * FROM patients WHERE city IN (
    SELECT city FROM patients GROUP BY city HAVING COUNT(*) >= 5
);
```

### Ärzte, die mindestens einen Patienten behandelt haben
```sql
SELECT * FROM doctors WHERE doctor_id IN (
    SELECT DISTINCT attending_doctor_id FROM admissions
);
```

### Patienten, die jünger als der Durchschnitt aller Patienten sind
```sql
SELECT * FROM patients WHERE birth_date > (
    SELECT AVG(birth_date) FROM patients
);
```

### Städte mit der höchsten durchschnittlichen Patientenhöhe
```sql
SELECT city FROM patients GROUP BY city HAVING AVG(height) = (
    SELECT MAX(avg_height) FROM (
        SELECT city, AVG(height) AS avg_height FROM patients GROUP BY city
    ) AS subquery
);
```

Diese Übungen decken die Grundlagen sowie komplexere SQL-Abfragen ab und bereiten optimal auf die IHK-Prüfung vor! 🚀
