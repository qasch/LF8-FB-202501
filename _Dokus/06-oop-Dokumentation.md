# Einführung in die Objektorientierte Programmierung (OOP) in Java

## Grundlagen der OOP
Die objektorientierte Programmierung (OOP) ist ein Programmierparadigma, das auf den Konzepten von **Objekten** und **Klassen** basiert. In Java bildet OOP den Kern der Sprache.

### Wichtige Konzepte:
1. **Klassen und Objekte**:
   - Eine Klasse ist eine Vorlage oder ein Bauplan für Objekte.
   - Ein Objekt ist eine Instanz einer Klasse.

2. **Attribute und Methoden**:
   - Attribute speichern den Zustand eines Objekts (z. B. Variablen).
   - Methoden definieren das Verhalten eines Objekts (z. B. Funktionen).

3. **Kapselung**:
   - Die Daten eines Objekts werden vor unberechtigtem Zugriff geschützt.
   - Zugriffsmodifikatoren (siehe unten) spielen dabei eine wichtige Rolle.

4. **Konstruktoren**:
   - Konstruktoren sind spezielle Methoden, die verwendet werden, um ein Objekt zu initialisieren.

5. **Das Schlüsselwort `this`**:
   - Verweist auf die aktuelle Instanz einer Klasse.

## Klassen und Attribute
Eine Klasse in Java besteht aus Attributen (Daten) und Methoden (Funktionen). Attribute repräsentieren den Zustand eines Objekts.

### Beispiel:
```java
public class Auto {
    // Attribute
    private String marke;
    private String farbe;
    private int geschwindigkeit;

    // Konstruktor
    public Auto(String marke, String farbe) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschwindigkeit = 0; // Standardwert
    }

    // Getter und Setter
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void beschleunige(int wert) {
        this.geschwindigkeit += wert;
    }
}
```

### Wichtige Punkte:
- Attribute werden in der Regel privat deklariert (`private`), um sie vor direktem Zugriff zu schützen.
- Zugriff und Änderungen erfolgen über **Getter** und **Setter**.

## Zugriffsmodifikatoren
Zugriffsmodifikatoren steuern die Sichtbarkeit von Klassen, Methoden und Attributen.

| Modifikator      | Beschreibung                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `public`         | Zugriff von überall.                                                       |
| `private`        | Zugriff nur innerhalb der eigenen Klasse.                                  |
| `protected`      | Zugriff innerhalb der Klasse, des Pakets und von Unterklassen.            |
| (kein Modifikator) | Paket-Sichtbarkeit: Zugriff nur innerhalb desselben Pakets.              |

### Beispiel:
```java
public class Beispiel {
    private int privatAttribut; // Nur innerhalb der Klasse sichtbar
    public int publicAttribut; // Von überall sichtbar

    public int getPrivatAttribut() {
        return privatAttribut;
    }

    public void setPrivatAttribut(int wert) {
        this.privatAttribut = wert;
    }
}
```

## Konstruktoren und Überladen
Konstruktoren dienen dazu, Objekte zu initialisieren. In Java können Konstruktoren überladen werden, um verschiedene Initialisierungsvarianten anzubieten.

### Überladen von Konstruktoren
Das Überladen bedeutet, dass mehrere Konstruktoren oder Methoden mit demselben Namen, aber unterschiedlichen Parameterlisten definiert werden können. Dies ermöglicht flexiblen Code, der je nach Bedarf unterschiedliche Initialisierungen oder Verarbeitungen durchführen kann.

### Beispiel:
```java
public class Rechteck {
    private double breite;
    private double hoehe;

    // Konstruktor mit Breite und Höhe
    public Rechteck(double breite, double hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    // Standardkonstruktor (überladen)
    public Rechteck() {
        this(1, 1); // Standardwerte
    }

    public double berechneFlaeche() {
        return breite * hoehe;
    }
}
```

### Wichtige Punkte:
- Konstruktoren haben keinen Rückgabetyp.
- Sie können mit unterschiedlichen Parameterlisten definiert werden (Überladen).
- Das Schlüsselwort `this` kann verwendet werden, um andere Konstruktoren derselben Klasse aufzurufen.

## Das Schlüsselwort `this`
Das Schlüsselwort `this` wird in einer Klasse verwendet, um auf das aktuelle Objekt zu verweisen.

### Anwendungsfälle:
1. **Zugriff auf Attribute mit gleichen Namen wie Parameter:**
   Wenn der Name eines Parameters identisch mit dem Namen eines Attributs ist, wird `this` verwendet, um das Attribut der aktuellen Instanz zu unterscheiden.
   ```java
   public void setName(String name) {
       this.name = name; // `this.name` bezieht sich auf das Attribut, `name` auf den Parameter
   }
   ```

2. **Aufruf eines anderen Konstruktors:**
   Konstruktoren können mit `this` aufgerufen werden, um Redundanz zu vermeiden.
   ```java
   public Rechteck(double breite, double hoehe) {
       this.breite = breite;
       this.hoehe = hoehe;
   }

   public Rechteck() {
       this(1, 1); // Ruft den ersten Konstruktor auf
   }
   ```

3. **Übergabe des aktuellen Objekts als Argument:**
   `this` kann verwendet werden, um die aktuelle Instanz an eine Methode oder einen Konstruktor zu übergeben.
   ```java
   public void druckeDetails() {
       System.out.println(this);
   }
   ```

4. **Methodenaufrufe auf der aktuellen Instanz:**
   `this` kann verwendet werden, um Methoden der aktuellen Instanz aufzurufen.
   ```java
   public void starte() {
       this.initialisiere();
   }

   private void initialisiere() {
       // Initialisierungscode
   }
   ```

## Der Rückgabewert `void`
Das Schlüsselwort `void` wird verwendet, wenn eine Methode keinen Rückgabewert hat. Methoden mit `void` führen eine Aktion aus, ohne Daten zurückzugeben.

### Beispiel:
```java
public class Beispiel {
    public void druckeNachricht() {
        System.out.println("Hallo, Welt!");
    }
}
```

### Wichtige Punkte:
- Eine Methode mit `void` kann Eingaben (Parameter) akzeptieren, gibt jedoch keine Werte zurück.
- Solche Methoden sind oft für Aktionen wie das Anzeigen von Ausgaben oder das Ändern von Zuständen eines Objekts geeignet.
- Wenn eine Methode einen Wert zurückgeben soll, wird stattdessen ein Rückgabetyp (z. B. `int`, `String`, etc.) angegeben.

### Vergleich:
Mit Rückgabewert:
```java
public int addiere(int a, int b) {
    return a + b;
}
```

Ohne Rückgabewert (mit `void`):
```java
public void zeigeErgebnis(int a, int b) {
    System.out.println("Das Ergebnis ist: " + (a + b));
}
```

## Methoden
Methoden definieren das Verhalten einer Klasse. Sie können Eingaben (Parameter) annehmen und Ausgaben (Rückgabewerte) liefern.

### Beispiel:
```java
public class Kreis {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }
}
```

### Wichtige Punkte:
- Methoden werden mit einem bestimmten Rückgabewert-Typ definiert (z. B. `int`, `void`).
- `void` bedeutet, dass die Methode keinen Rückgabewert hat.
- Methoden können durch Parameter flexibel gestaltet werden.

