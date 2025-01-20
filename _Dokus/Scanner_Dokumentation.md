# Einführung in die Nutzung des `Scanner` zur Eingabe in Java

Der `Scanner` in Java ist ein nützliches Werkzeug, um Benutzereingaben von der Konsole zu lesen. Mit ihm können verschiedene Datentypen wie `String`, `int`, `double` und viele mehr eingelesen werden. Diese Dokumentation zeigt, wie man den `Scanner` effektiv einsetzt, mit Beispielen für Einsteiger.

## 1. Grundlagen

### Scanner importieren

Um den `Scanner` nutzen zu können, muss er aus dem Paket `java.util` importiert werden:

```java
import java.util.Scanner;
```

---

### Scanner initialisieren

Ein Scanner wird initialisiert, indem er mit `System.in` verbunden wird:

```java
Scanner scanner = new Scanner(System.in);
```

---

### Scanner schließen

Am Ende des Programms sollte der Scanner mit `scanner.close()` geschlossen werden, um Ressourcen freizugeben:

```java
scanner.close();
```

---

## 2. Datentypen einlesen

### Einlesen eines Strings

```java
import java.util.Scanner;

public class StringEingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine(); // Liest die gesamte Zeile ein
        System.out.println("Hallo, " + name + "!");
        scanner.close();
    }
}
```

---

### Einlesen eines Integers

```java
import java.util.Scanner;

public class IntegerEingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt(); // Liest eine Ganzzahl ein
        System.out.println("Sie sind " + alter + " Jahre alt.");
        scanner.close();
    }
}
```

---

### Einlesen eines Double-Werts

```java
import java.util.Scanner;

public class DoubleEingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Dezimalzahl ein: ");
        double zahl = scanner.nextDouble(); // Liest eine Dezimalzahl ein
        System.out.println("Ihre Eingabe: " + zahl);
        scanner.close();
    }
}
```

---

### Einlesen mehrerer Werte

```java
import java.util.Scanner;

public class MehrfacheEingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie Ihren Vornamen ein: ");
        String vorname = scanner.next();

        System.out.print("Geben Sie Ihren Nachnamen ein: ");
        String nachname = scanner.next();

        System.out.print("Geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Hallo, " + vorname + " " + nachname + ". Sie sind " + alter + " Jahre alt.");

        scanner.close();
    }
}
```

---

## 3. Fehlerbehandlung

### Überprüfung der Eingabe

Es ist wichtig, die Eingabe des Benutzers zu validieren, um Fehler zu vermeiden. Der Scanner bietet Methoden wie `hasNextInt()` oder `hasNextDouble()`, um sicherzustellen, dass der Benutzer den erwarteten Datentyp eingibt.

```java
import java.util.Scanner;

public class Fehlerbehandlung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine Ganzzahl ein: ");
        if (scanner.hasNextInt()) {
            int zahl = scanner.nextInt();
            System.out.println("Sie haben die Zahl " + zahl + " eingegeben.");
        } else {
            System.out.println("Das ist keine gültige Ganzzahl!");
        }

        scanner.close();
    }
}
```

---

## 4. Tipps und Tricks

1. **Zeilenumbrüche beachten**: Methoden wie `nextLine()` und `next()` verhalten sich unterschiedlich. Nach Methoden wie `nextInt()` oder `nextDouble()` sollte man manchmal `scanner.nextLine()` aufrufen, um verbleibende Zeilenumbrüche zu verarbeiten.
   
   ```java
   System.out.print("Geben Sie Ihr Alter ein: ");
   int alter = scanner.nextInt();
   scanner.nextLine(); // Verarbeitet den Zeilenumbruch
   System.out.print("Geben Sie Ihren Namen ein: ");
   String name = scanner.nextLine();
   ```

2. **Ressourcenmanagement**: Der Scanner sollte immer mit `scanner.close()` geschlossen werden, um unnötige Ressourcennutzung zu vermeiden.

3. **Fehler vermeiden**: Prüfen Sie immer den Datentyp mit `hasNext<Type>()`, bevor Sie eine Eingabe verarbeiten.

---

## 5. Zusammenfassung

Der `Scanner` ist ein vielseitiges Werkzeug für Benutzereingaben in Java. Die wichtigsten Methoden auf einen Blick:

| Methode         | Beschreibung                           |
|-----------------|---------------------------------------|
| `nextLine()`    | Liest eine ganze Zeile als `String`.   |
| `next()`        | Liest das nächste Wort als `String`.   |
| `nextInt()`     | Liest eine Ganzzahl (`int`).           |
| `nextDouble()`  | Liest eine Dezimalzahl (`double`).     |
| `hasNext<Type>()` | Prüft, ob der nächste Wert vom angegebenen Typ ist. |

Mit diesen Grundlagen können Einsteiger problemlos Programme mit Benutzereingaben schreiben.
