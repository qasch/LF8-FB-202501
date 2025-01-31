# Subselect Beispiele für sql-practice.com

## 1. Subselect in der WHERE-Klausel

Zeige alle Patienten, die von einem Arzt mit der Fachrichtung "Cardiologist" behandelt wurden.

```sql
SELECT first_name, last_name
FROM patients
WHERE patient_id IN (
    SELECT patient_id
    FROM admissions
    WHERE attending_doctor_id IN (
        SELECT doctor_id
        FROM doctors
        WHERE specialty = 'Cardiologist'
    )
);
```

## 2. Subselect in der SELECT-Klausel

Zeige die Namen aller Ärzte und die Anzahl der Patienten, die sie behandelt haben.

```sql
SELECT 
    first_name || ' ' || last_name AS doctor_name,
    (SELECT COUNT(*)
     FROM admissions
     WHERE admissions.attending_doctor_id = doctors.doctor_id) AS patient_count
FROM doctors;
```

## 3. Subselect in der FROM-Klausel

Zeige die durchschnittliche Aufenthaltsdauer (in Tagen) pro Arzt.

```sql
SELECT 
    doctor_id,
    AVG(duration) AS avg_stay_duration
FROM (
    SELECT 
        attending_doctor_id AS doctor_id,
        JULIANDAY(discharge_date) - JULIANDAY(admission_date) AS duration
    FROM admissions
    WHERE discharge_date IS NOT NULL
) AS stay_durations
GROUP BY doctor_id;
```


## 4. Korrelierte Subselects

Aufgabe: Zeige alle Patienten, deren Körpergewicht über dem Durchschnitt aller Patienten liegt.

```sql
SELECT first_name, last_name, weight
FROM patients
WHERE weight > (
    SELECT AVG(weight)
    FROM patients
    WHERE weight IS NOT NULL
);
```
