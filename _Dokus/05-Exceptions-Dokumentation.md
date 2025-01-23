# Referenz: Exceptions in Java

## Was sind Exceptions?

Exceptions (Ausnahmen) sind besondere Ereignisse, die während der Programmausführung auftreten und den normalen Ablauf des Programms unterbrechen. Sie treten auf, wenn ein unerwarteter Zustand eintritt, wie z. B. eine Division durch Null, der Zugriff auf ein ungültiges Array-Element, oder der Versuch, eine Datei zu öffnen, die nicht vorhanden ist. Man spricht hier von sogenannten *Laufzeitfehlern*.

## Exception-Hierarchie

In Java sind alle Exceptions Unterklassen der Klasse `Throwable`. Die wichtigsten Unterklassen sind:

- **`Error`**: Wird für schwerwiegende Fehler verwendet, die normalerweise nicht vom Programm behandelt werden (z. B. `OutOfMemoryError`).
- **`Exception`**: Wird für behandelbare Fehler verwendet. Hier gibt es zwei Arten:
  - **Checked Exceptions**: Müssen explizit behandelt werden (z. B. `IOException`, `SQLException`).
  - **Unchecked Exceptions**: Müssen nicht behandelt werden (z. B. `NullPointerException`, `ArrayIndexOutOfBoundsException`).

### Beispiel einer Exception-Hierarchie:

```
Throwable
|
|-- Error
|
|-- Exception
     |-- RuntimeException
          |-- NullPointerException
          |-- ArrayIndexOutOfBoundsException
     |-- IOException
```

## Umgang mit Exceptions

### 1. `try-catch`

Mit einem `try-catch`-Block kannst du Exceptions abfangen und behandeln.

```java
try {
    // Code, der eine Exception auslösen könnte
} catch (ExceptionTyp e) {
    // Code zur Behandlung der Exception
}
```

#### Beispiel:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Fehler: Division durch Null");
}
```

### 2. `finally`

Ein `finally`-Block wird immer ausgeführt, unabhängig davon, ob eine Exception auftritt oder nicht. Er wird häufig für das Freigeben von Ressourcen verwendet.

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index außerhalb des gültigen Bereichs.");
} finally {
    System.out.println("Dieser Block wird immer ausgeführt.");
}
```

### 3. `throw` und `throws`

#### `throw`
Mit `throw` kannst du eine Exception manuell auslösen.

```java
if (age < 0) {
    throw new IllegalArgumentException("Alter kann nicht negativ sein");
}
```

#### `throws`
Mit `throws` deklarierst du, dass eine Methode eine Exception auslösen kann.

```java
public void readFile(String fileName) throws IOException {
    // Code, der IOException auslösen kann
}
```

## Wichtige Built-in Exceptions

### Checked Exceptions:
- **`IOException`**: Wird bei Eingabe-/Ausgabefehlern ausgelöst.
- **`SQLException`**: Tritt bei Datenbankoperationen auf.

### Unchecked Exceptions:
- **`NullPointerException`**: Wird ausgelöst, wenn auf ein `null`-Objekt zugegriffen wird.
- **`ArrayIndexOutOfBoundsException`**: Tritt auf, wenn auf einen ungültigen Index eines Arrays zugegriffen wird.
- **`ArithmeticException`**: Wird bei mathematischen Fehlern wie Division durch null ausgelöst.

## Eigene Exceptions erstellen

Du kannst eigene Exceptions erstellen, indem du die Klasse `Exception` oder `RuntimeException` erweiterst.

```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("Dies ist eine benutzerdefinierte Exception.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## Best Practices

1. **Nur spezifische Exceptions abfangen:** Vermeide generelle Catch-Blöcke wie `catch (Exception e)`.
2. **Klare Fehlermeldungen:** Gib dem Benutzer verständliche Fehlermeldungen.
3. **Ressourcen freigeben:** Nutze `finally` oder `try-with-resources` für das Freigeben von Ressourcen.
4. **Nicht alle Exceptions behandeln:** Einige Exceptions wie `OutOfMemoryError` oder `StackOverflowError` sollten nicht abgefangen werden.
5. **Eigene Exceptions nur bei Bedarf erstellen:** Verwende Built-in Exceptions, wenn möglich.

## Ressourcen für weitere Informationen

- [Java Documentation - Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Effektive Fehlerbehandlung in Java](https://www.baeldung.com/java-exceptions)

