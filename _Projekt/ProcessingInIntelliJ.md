# Processing in IntelliJ nutzen

## Voraussetzungen
- Processing installieren: Lade die neueste Version von Processing von der offiziellen Processing-Website herunter.
- IntelliJ IDEA: Stelle sicher, dass IntelliJ installiert ist (Community- oder Ultimate-Version).

## Schritt 1: Processing Core-Bibliothek herunterladen
- Öffne Processing.
- Gehe zu *File* > *Preferences* und notiere den Ordnerpfad unter „Sketchbook location“.
- Navigiere in deinem Dateisystem zu diesem Pfad, und gehe zu `libraries/core/library`.
- Kopiere die Datei `core.jar`, da sie die grundlegende Processing-Funktionalität enthält.

## Schritt 2: Neues Projekt in IntelliJ erstellen
- Starte IntelliJ IDEA.
- Wähle *New Project*.
- Wähle als Projekt-Typ *Java* aus und klicke auf *Next*.
- Gib deinem Projekt einen Namen und wähle ein Speicherverzeichnis.
- Klicke auf *Finish*, um das Projekt zu erstellen.

## Schritt 3: Processing-Bibliothek hinzufügen
- Klicke in IntelliJ im Projektfenster mit der rechten Maustaste auf dein Projekt und wähle *Open Module Settings* (oder drücke F4).
- Gehe zu *Libraries* und klicke auf das +-Symbol.
- Wähle *Java* und füge die `core.jar`-Datei hinzu, die du aus dem Processing-Ordner kopiert hast.
- Klicke auf *OK*, um die Bibliothek hinzuzufügen.

## Schritt 4: Processing-Setup in deiner Klasse
- Erstelle eine neue Klasse in deinem Projekt (z. B. `Main`).
- Importiere die Processing-Klassen und erweitere deine Klasse von `PApplet`.

Beispielcode:
```java
import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        // Startet die Processing-Anwendung
        PApplet.main("Main");
    }

    // Setup-Methode: Wird einmal beim Start ausgeführt
    public void settings() {
        size(800, 600); // Fenstergröße definieren
    }

    // Draw-Methode: Wird kontinuierlich ausgeführt
    public void draw() {
        background(200); // Hintergrundfarbe
        ellipse(mouseX, mouseY, 50, 50); // Kreis folgt der Maus
    }
}
```
## Schritt 5: Projekt ausführen
- Klicke mit der rechten Maustaste auf die Main-Datei und wähle Run 'Main'.
- Ein Processing-Fenster sollte sich öffnen, und du kannst interaktive Inhalte wie gewohnt erstellen.
- Optional: IntelliJ für Processing-Projekte optimieren
- Autovervollständigung aktivieren: IntelliJ erkennt die Processing-Methoden automatisch, sobald die Bibliothek korrekt eingebunden ist.
- Sketches in Processing-Struktur speichern: Du kannst IntelliJ so konfigurieren, dass deine Sketches im selben Ordner wie deine Processing-Sketches gespeichert werden.
