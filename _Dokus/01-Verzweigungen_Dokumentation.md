
# Einführung in Verzweigungen in Java

Verzweigungen ermöglichen es, Entscheidungen basierend auf Bedingungen zu treffen. In Java stehen mehrere Konstrukte zur Verfügung, um Verzweigungen zu implementieren, darunter `if`, `else`, `if-else` und `switch-case`. Diese Dokumentation bietet eine Einführung mit Beispielen für Einsteiger.

---

## 1. Grundlagen der Verzweigungen

### if-Anweisung

Die `if`-Anweisung führt einen Block von Code aus, wenn eine Bedingung wahr ist.

```java
public class IfBeispiel {
    public static void main(String[] args) {
        int zahl = 10;
        if (zahl > 5) {
            System.out.println("Die Zahl ist größer als 5.");
        }
    }
}
```

---

### if-else-Anweisung

Die `if-else`-Anweisung erlaubt die Ausführung eines alternativen Codeblocks, wenn die Bedingung falsch ist.

```java
public class IfElseBeispiel {
    public static void main(String[] args) {
        int zahl = 3;
        if (zahl > 5) {
            System.out.println("Die Zahl ist größer als 5.");
        } else {
            System.out.println("Die Zahl ist kleiner oder gleich 5.");
        }
    }
}
```

---

### if-else if-else-Anweisung

Mit der `if-else if-else`-Anweisung können mehrere Bedingungen überprüft werden.

```java
public class IfElseIfBeispiel {
    public static void main(String[] args) {
        int zahl = 10;
        if (zahl > 15) {
            System.out.println("Die Zahl ist größer als 15.");
        } else if (zahl > 5) {
            System.out.println("Die Zahl ist größer als 5, aber kleiner oder gleich 15.");
        } else {
            System.out.println("Die Zahl ist kleiner oder gleich 5.");
        }
    }
}
```

---

## 2. switch-case-Anweisung

Die `switch-case`-Anweisung wird verwendet, wenn eine Variable auf mehrere mögliche Werte geprüft werden soll. Sie ist eine Alternative zu mehreren `if-else`-Blöcken.

### Aufbau

```java
switch (variable) {
    case wert1:
        // Code für Fall 1
        break;
    case wert2:
        // Code für Fall 2
        break;
    default:
        // Code für den Standardfall
}
```

### Beispiel

```java
public class SwitchBeispiel {
    public static void main(String[] args) {
        int tag = 3;
        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Ungültiger Tag.");
        }
    }
}
```

---

## 3. Verschachtelte Verzweigungen

Verzweigungen können verschachtelt werden, um komplexere Logiken zu implementieren.

```java
public class VerschachtelteIfBeispiel {
    public static void main(String[] args) {
        int zahl = 20;
        if (zahl > 10) {
            if (zahl % 2 == 0) {
                System.out.println("Die Zahl ist größer als 10 und gerade.");
            } else {
                System.out.println("Die Zahl ist größer als 10 und ungerade.");
            }
        }
    }
}
```

---

## 4. Tipps und Tricks

1. **Code-Lesbarkeit**: Verwenden Sie `switch-case`, wenn viele Werte geprüft werden, um die Lesbarkeit zu verbessern.
2. **Immer `break` verwenden**: Vergessen Sie nicht das `break` in `switch-case`, um das Durchfallen zu vermeiden.
3. **Standardfall im Blick**: Implementieren Sie immer einen `else`- oder `default`-Fall, um unerwartete Eingaben zu behandeln.
4. **Logik prüfen**: Stellen Sie sicher, dass Bedingungen in `if-else if`-Ketten logisch zusammenhängen.

---

## 5. Zusammenfassung

| Konstruktion         | Beschreibung                               | Beispiel                         |
|----------------------|-------------------------------------------|----------------------------------|
| `if`                | Führt Code aus, wenn die Bedingung wahr ist. | Prüfung auf eine Bedingung       |
| `if-else`           | Führt Code basierend auf einer Bedingung aus. | Zwei mögliche Pfade              |
| `if-else if-else`   | Prüft mehrere Bedingungen.                 | Mehrere Pfade                    |
| `switch-case`       | Prüft eine Variable auf mehrere Werte.      | Alternative zu mehreren `if-else`|

Mit diesen Grundlagen können Sie in Java Entscheidungen effektiv implementieren.
