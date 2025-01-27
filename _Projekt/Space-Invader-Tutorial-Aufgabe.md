# Anleitung: Eigenständige Entwicklung von Space Invaders

## Einleitung
In dieser Anleitung programmierst du eigenständig eine vereinfachte Version des Spiels **Space Invaders**. Das Ziel ist es, die Grundlagen der Programmierung und objektorientierten Programmierung (OOP) anzuwenden. Schritt für Schritt baust du das Spiel auf, indem du Klassen erstellst, Objekte modellierst und die Spielmechanik implementierst.

**Hinweis:** Diese Anleitung setzt voraus, dass du bereits die grundlegenden Konzepte von Klassen, Objekten, Methoden, Konstruktoren und Schleifen kennst. Wenn etwas unklar ist, frage deinen Trainer!

---

## Ziel des Spiels

Das Ziel von Space Invaders ist es, feindliche Aliens abzuschießen, bevor sie den unteren Bildschirmrand erreichen. Der Spieler steuert ein Raumschiff, das sich horizontal bewegt und Laser abfeuert.

---

## Schritt-für-Schritt-Anleitung

### 1. Projektvorbereitung

#### Erstelle ein neues Processing-Projekt:
1. Öffne IntelliJ IDEA und erstelle ein neues Projekt.
2. Füge die Processing-Core-Bibliothek hinzu (wie in vorherigen Projekten gezeigt).
3. Erstelle eine Hauptklasse, z. B. `SpaceInvadersGame`. Diese Klasse steuert das gesamte Spiel.

```java
import processing.core.PApplet;

public class SpaceInvadersGame extends PApplet {
    public static void main(String[] args) {
        PApplet.main("SpaceInvadersGame");
    }

    public void settings() {
        size(800, 600); // Fenstergröße
    }

    public void setup() {
        // Hier initialisieren wir das Spiel später
    }

    public void draw() {
        background(0); // Schwarzer Hintergrund
    }
}
```

**Aufgabe:** Teste die Fenstergröße und den Hintergrund. Ändere die Größe oder die Hintergrundfarbe, um die Auswirkungen zu verstehen.

---

### 2. Das Raumschiff erstellen

#### Eigenschaften:
- Das Raumschiff bewegt sich horizontal.
- Es kann Laserschüsse abfeuern.

#### Schritte:
1. Erstelle eine Klasse `Spaceship`.
2. Überlege dir, welche Eigenschaften das Raumschiff braucht (z. B. Position, Größe, Farbe).
3. Implementiere Methoden für das Zeichnen des Raumschiffs und die Bewegung.

**Hinweis:** Die Bewegung sollte mit den Tasten `A` (links) und `D` (rechts) gesteuert werden.

**Denke daran:**
- Begrenze die Bewegung des Raumschiffs, damit es nicht außerhalb des Fensters verschwindet.
- Verwende die `keyPressed`-Methode, um die Steuerung zu implementieren.

---

### 3. Laserschüsse hinzufügen

#### Eigenschaften:
- Laserschüsse bewegen sich vertikal nach oben.
- Jeder Schuss ist ein eigenständiges Objekt.

#### Schritte:
1. Erstelle eine Klasse `Laser`.
2. Definiere die Eigenschaften des Lasers (z. B. Position, Geschwindigkeit, Farbe).
3. Implementiere Methoden für das Zeichnen und die Bewegung des Lasers.
4. Erstelle eine Liste (z. B. `ArrayList`), um mehrere Laserschüsse zu verwalten.
5. Füge in der Hauptklasse Code hinzu, um neue Laserschüsse zu erstellen, wenn der Spieler die Leertaste drückt.

**Überlege:**
- Wie entfernst du Laserschüsse, die den oberen Rand des Fensters erreichen?
- Warum ist eine Liste sinnvoll, um die Laserschüsse zu verwalten?

---

### 4. Aliens erstellen

#### Eigenschaften:
- Aliens bewegen sich horizontal und ändern die Richtung, wenn sie den Rand erreichen.
- Sie bewegen sich nach unten, wenn sie die Richtung ändern.

#### Schritte:
1. Erstelle eine Klasse `Alien`.
2. Definiere die Eigenschaften der Aliens (z. B. Position, Größe, Farbe, Geschwindigkeit).
3. Implementiere Methoden für das Zeichnen und die Bewegung der Aliens.
4. Erstelle in der Hauptklasse eine Liste von Aliens, um mehrere Feinde darzustellen.

**Fragen zum Nachdenken:**
- Wie kannst du dafür sorgen, dass die Aliens ihre Richtung ändern?
- Wie erkennst du, ob ein Alien den unteren Rand erreicht hat?

---

### 5. Kollisionserkennung

#### Ziel:
- Wenn ein Laser ein Alien trifft, wird das Alien entfernt.

#### Schritte:
1. Schreibe eine Methode, die prüft, ob sich ein Laser und ein Alien überschneiden.
2. Wenn eine Kollision erkannt wird, entferne sowohl den Laser als auch das Alien.
3. Erhöhe den Punktestand bei einer Kollision.

**Tipp:** In Processing kannst du einfache Kollisionen mit Rechtecken oder Kreisen prüfen, indem du die Positionen und Größen der Objekte vergleichst.

---

### 6. Punktestand und Spielende

#### Punktestand:
1. Füge eine Variable für den Punktestand hinzu.
2. Zeige den Punktestand in der oberen Ecke des Bildschirms an.

#### Spielende:
1. Beende das Spiel, wenn ein Alien den unteren Rand erreicht.
2. Zeige eine "Game Over"-Nachricht an.

---

### 7. Erweiterungen (optional)

Falls Zeit bleibt, kannst du das Spiel erweitern:
- **Schwierigkeitsgrad:** Erhöhe die Geschwindigkeit der Aliens im Laufe der Zeit.
- **Mehrere Reihen von Aliens:** Erstelle ein Raster aus Aliens.
- **Power-Ups:** Füge besondere Fähigkeiten hinzu (z. B. schnellere Laserschüsse).

---

## Abschluss

Herzlichen Glückwunsch! Wenn du die Schritte befolgt hast, hast du dein eigenes Space-Invaders-Spiel programmiert. Du hast dabei wichtige Konzepte der objektorientierten Programmierung angewendet und ein interaktives Projekt erstellt. Zeige dein Spiel deinen Mitschülern und überlege, wie du es weiter verbessern kannst!

