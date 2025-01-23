# Aufgaben zur OOP in Java

## Aufgabe 1: Die Klasse `Pflanze`

Erstelle eine Klasse `Pflanze`, die folgende Anforderungen erfüllt:

1. Die Klasse hat die Attribute:
   - `art` (String, öffentlich lesbar, aber nicht direkt änderbar),
   - `hoehe` (double, nur innerhalb der Klasse sichtbar, repräsentiert die Höhe in cm),
   - `standort` (String, nur lesbar),
   - `wasserbedarf` (double, kann gelesen und geändert werden, repräsentiert den Wasserbedarf in Litern pro Woche).

2. Implementiere zwei Konstruktoren:
   - Einen Konstruktor, der alle Attribute initialisiert.
   - Einen Konstruktor, der nur `art` und `standort` annimmt und die anderen Attribute auf Standardwerte setzt (`hoehe` auf 10 cm, `wasserbedarf` auf 1 Liter).

3. Implementiere Methoden:
   - Eine öffentliche Methode `setHoehe(double hoehe)`, um die Höhe der Pflanze zu ändern.
   - Eine öffentliche Methode `getHoehe()`, um die aktuelle Höhe der Pflanze zurückzugeben.
   - Eine öffentliche Methode `wachse(double cm)`, die die Höhe der Pflanze um die angegebene Anzahl von Zentimetern erhöht.

4. Verwende das Schlüsselwort `this`, wo es notwendig ist.

Schreibe ein Hauptprogramm, das eine `Pflanze` erstellt, die Höhe verändert und die Wachstumsfunktion aufruft.

## Aufgabe 2: Die Klasse `Rechteck`

Erstelle eine Klasse `Rechteck`, die folgende Anforderungen erfüllt:

1. Die Klasse hat die Attribute:
   - `breite` (double, nur sichtbar innerhalb der Klasse),
   - `hoehe` (double, nur sichtbar innerhalb der Klasse).

2. Implementiere zwei Konstruktoren:
   - Einen Konstruktor, der die Breite und Höhe initialisiert.
   - Einen Standardkonstruktor, der ein Quadrat mit einer Kantenlänge von 1 erstellt (Breite und Höhe auf 1 setzen).

3. Implementiere Methoden:
   - Eine öffentliche Methode `berechneFlaeche()`, die die Fläche des Rechtecks berechnet.
   - Eine öffentliche Methode `berechneUmfang()`, die den Umfang des Rechtecks berechnet.
   - Eine Methode `setSeiten(double breite, double hoehe)`, um Breite und Höhe zu ändern.

4. Verwende das Schlüsselwort `this` in Konstruktoren und Methoden, wo es sinnvoll ist.

Schreibe ein Hauptprogramm, das ein Rechteck erstellt, dessen Fläche und Umfang berechnet und die Seiten ändert.

## Aufgabe 3: Die Klasse `Computer`

Erstelle eine Klasse `Computer`, die folgende Anforderungen erfüllt:

### Anforderungen:
1. Die Klasse hat die Attribute:
   - `seriennummer` (int, nur lesbar),
   - `besitzer` (String, öffentlich zugänglich),
   - `speicherplatz` (int, privat, nur innerhalb der Klasse sichtbar, in GB).

2. Implementiere Konstruktoren:
   - Einen Konstruktor, der `seriennummer` und `besitzer` initialisiert, und den `speicherplatz` auf 256 GB setzt.
   - Einen Konstruktor, der alle drei Attribute initialisiert.

3. Implementiere Methoden:
   - Eine Methode `speicherHinzufuegen(int gb)`, um zusätzlichen Speicherplatz hinzuzufügen.
   - Eine Methode `speicherLoeschen(int gb)`, die Speicherplatz freigibt, aber sicherstellt, dass der Speicherplatz nicht negativ wird (gib eine Fehlermeldung aus, wenn das nicht möglich ist).
   - Eine Methode `zeigeDetails()`, die die Seriennummer, den Besitzer und den verfügbaren Speicherplatz ausgibt.

4. Verwende das Schlüsselwort `this` in Konstruktoren und Methoden, wo es angebracht ist.

Schreibe ein Hauptprogramm, das einen `Computer` erstellt, Speicherplatz hinzufügt und entfernt und die Details des Computers ausgibt.
