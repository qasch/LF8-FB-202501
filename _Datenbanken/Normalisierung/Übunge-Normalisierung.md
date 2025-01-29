# Aufgaben zur Normalisierung

Im Folgenden finden Sie sechs Aufgaben zur Normalisierung von Datenbanken. Jede Aufgabe beinhaltet eine kurze Beschreibung der gegebenen Datenstruktur und fordert die Durchführung einer Normalisierung bis zu einer bestimmten Normalform (NF). **Hinweis:** Gegebenenfalls müssen neue Tabellen erstellt und Beziehungen definiert werden.

## Aufgabe 1: Erste Normalform (1NF)
**Beschreibung:**
Gegeben ist die folgende Tabelle `Bestellungen`:

| BestellID | Kunde    | Artikel            | Anzahl |
|-----------|----------|--------------------|--------|
| 1         | Müller   | Stuhl, Tisch       | 2, 1   |
| 2         | Schmidt  | Lampe             | 1      |
| 3         | Müller   | Stuhl, Lampe      | 1, 2   |

**Aufgabe:**
- Bringen Sie die Tabelle in die 1. Normalform.
- Die Daten sollten so umstrukturiert werden, dass keine mehrfachen Werte in einer Zelle vorkommen.

## Aufgabe 2: Zweite Normalform (2NF)
**Beschreibung:**
Gegeben ist die folgende Tabelle `Kurse`:

| KursID | Kursname        | Dozent       | StudentID | StudentName |
|--------|-----------------|--------------|-----------|-------------|
| 1      | Mathematik      | Dr. Müller   | 101       | Max Meier   |
| 1      | Mathematik      | Dr. Müller   | 102       | Lisa Schmidt|
| 2      | Informatik      | Dr. Schmidt  | 103       | Peter Klein |

**Aufgabe:**
- Überprüfen Sie, ob die Tabelle in der 1. Normalform ist. Falls nicht, bringen Sie sie in die 1NF.
- Zerlegen Sie die Tabelle anschließend so, dass sie die 2. Normalform erfüllt.

## Aufgabe 3: Dritte Normalform (3NF)
**Beschreibung:**
Gegeben ist die folgende Tabelle `Mitarbeiter`:

| MitarbeiterID | Name       | Abteilung       | Abteilungsleiter |
|---------------|------------|-----------------|------------------|
| 1             | Max Meier  | Buchhaltung     | Anna Schuster    |
| 2             | Lisa Klein | IT              | Tom Bauer        |
| 3             | Peter Groß | Buchhaltung     | Anna Schuster    |

**Aufgabe:**
- Bringen Sie die Tabelle zunächst in die 2. Normalform (falls notwendig).
- Zerlegen Sie die Tabelle anschließend so, dass sie die 3. Normalform erfüllt.

## Aufgabe 4: Transitive Abhängigkeiten
**Beschreibung:**
Gegeben ist die folgende Tabelle `Produkte`:

| ProduktID | Produktname | Kategorie       | Lieferant     | LieferantAdresse |
|-----------|-------------|-----------------|---------------|------------------|
| 1         | Stuhl       | Möbel           | Holz GmbH     | Hauptstr. 1      |
| 2         | Tisch       | Möbel           | Holz GmbH     | Hauptstr. 1      |
| 3         | Lampe       | Beleuchtung     | Licht AG      | Nebenstr. 5      |

**Aufgabe:**
- Identifizieren Sie die transitiven Abhängigkeiten.
- Bringen Sie die Tabelle in die 3. Normalform, indem Sie die transitiven Abhängigkeiten eliminieren.

## Aufgabe 5: Zusammenfassung aller Normalformen
**Beschreibung:**
Gegeben ist die folgende Tabelle `Rechnungen`:

| RechnungsID | Kunde         | Artikel          | Menge | Preis | Gesamtpreis |
|-------------|---------------|------------------|-------|-------|-------------|
| 1           | Max Meier     | Stuhl            | 2     | 50    | 100         |
| 1           | Max Meier     | Tisch            | 1     | 200   | 200         |
| 2           | Lisa Schmidt  | Lampe            | 3     | 30    | 90          |

**Aufgabe:**
- Bringen Sie die Tabelle zunächst in die 1. Normalform.
- Überprüfen Sie anschließend die 2. und 3. Normalform und zerlegen Sie die Tabelle entsprechend.

## Aufgabe 6: Komplexere Normalisierung mit mehreren Abhängigkeiten
**Beschreibung:**
Gegeben ist die folgende Tabelle `Projektverwaltung` mit 10 Datensätzen:

| ProjektID | Projektname       | Kunde           | Mitarbeiter       | MitarbeiterRolle  | Abteilung       | Abteilungsleiter |
|-----------|-------------------|-----------------|-------------------|-------------------|-----------------|------------------|
| 1         | Website Redesign  | Müller GmbH     | Max Meier         | Entwickler        | IT              | Lisa Klein       |
| 1         | Website Redesign  | Müller GmbH     | Peter Groß        | Designer          | IT              | Lisa Klein       |
| 2         | App Entwicklung   | Schmidt AG      | Lisa Klein        | Projektleiter     | IT              | Lisa Klein       |
| 2         | App Entwicklung   | Schmidt AG      | Tom Bauer         | Entwickler        | IT              | Lisa Klein       |
| 3         | Datenanalyse Tool | TechCorp Ltd.   | Anna Schuster     | Analyst           | Datenanalyse    | Max Meier        |
| 3         | Datenanalyse Tool | TechCorp Ltd.   | Peter Groß        | Entwickler        | Datenanalyse    | Max Meier        |
| 4         | Marketing Dashboard | MarketExperts | Lisa Klein        | Designer          | Marketing       | Tom Bauer        |
| 4         | Marketing Dashboard | MarketExperts | Tom Bauer         | Entwickler        | Marketing       | Tom Bauer        |
| 5         | KI-Modell         | FutureAI GmbH   | Anna Schuster     | Projektleiter     | Forschung       | Peter Groß       |
| 5         | KI-Modell         | FutureAI GmbH   | Max Meier         | Entwickler        | Forschung       | Peter Groß       |

**Aufgabe:**
- Überprüfen Sie, ob die Tabelle in der 1. Normalform ist. Falls nicht, bringen Sie sie in die 1NF.
- Zerlegen Sie die Tabelle anschließend in kleinere Tabellen, sodass sie die 2. und 3. Normalform erfüllt.
- Identifizieren Sie redundante Daten und eliminieren Sie diese.
- Erstellen Sie sinnvolle Beziehungen zwischen den Tabellen, z. B. für Projekte, Mitarbeiter und Abteilungen.
- Stellen Sie sicher, dass keine transitive Abhängigkeit mehr besteht und alle Schlüssel eindeutig definiert sind.

