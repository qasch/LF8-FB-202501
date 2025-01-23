# Übungen zu Exceptions in Java

## Aufgabe 1: Division durch Null
Schreibe ein Programm, das zwei Zahlen von der Konsole einliest und die Division der beiden Zahlen durchführt. Stelle sicher, dass keine Division durch null erfolgt.

**Anforderungen:**
- Verwende einen `try-catch`-Block, um eine `ArithmeticException` abzufangen.
- Gib eine Fehlermeldung aus, wenn der Benutzer versucht, durch null zu teilen.
- Stelle sicher, dass das Programm nach der Fehlermeldung weiterläuft.

## Aufgabe 2: Array-Index überprüfen
Schreibe ein Programm, das ein Array mit fünf Zahlen enthält. Lass den Benutzer den Index der Zahl eingeben, die er anzeigen möchte. Stelle sicher, dass der Index gültig ist.

**Anforderungen:**
- Verwende einen `try-catch`-Block, um eine `ArrayIndexOutOfBoundsException` abzufangen.
- Gib eine Fehlermeldung aus, falls der Benutzer einen ungültigen Index angibt.
- Stelle sicher, dass das Programm nicht abstürzt.

## Aufgabe 3: Ungültige Benutzereingaben abfangen
Schreibe ein Programm, das den Benutzer auffordert, eine Ganzzahl einzugeben. Stelle sicher, dass keine andere Eingabe als eine Ganzzahl akzeptiert wird.

**Anforderungen:**
- Verwende einen `try-catch`-Block, um eine `InputMismatchException` abzufangen.
- Gib eine Fehlermeldung aus und fordere den Benutzer zur erneuten Eingabe auf.
- Nutze die Klasse `Scanner` für die Benutzereingabe.

## Aufgabe 4: Negatives Alter prüfen
Schreibe ein Programm, das das Alter eines Benutzers abfragt. Wirf eine `IllegalArgumentException`, falls das Alter negativ ist.

**Anforderungen:**
- Frage das Alter des Benutzers ab.
- Wirf eine `IllegalArgumentException`, falls das Alter negativ ist.
- Gib eine Fehlermeldung aus, falls eine Ausnahme ausgelöst wird.

## Aufgabe 5: Dateiüberprüfung und Ressourcenmanagement
Schreibe ein Programm, das den Zugriff auf eine Datei simuliert. Das Programm soll prüfen, ob die Datei existiert, und eine entsprechende Meldung ausgeben. Zusätzlich soll sichergestellt werden, dass Ressourcen (wie z. B. Streams) korrekt geschlossen werden.

**Erklärung:**
1. **Zugriff auf Dateien in Java:**
    - Die Klasse `File` wird verwendet, um Dateien und Verzeichnisse zu überprüfen.
    - Die Methode `exists()` prüft, ob die angegebene Datei existiert.
    - Typischerweise wird ein `try-catch-finally`-Block genutzt, um sicherzustellen, dass Ressourcen wie Datei-Streams immer freigegeben werden, selbst wenn ein Fehler auftritt.

**Beispiel für den allgemeinen Zugriff auf Dateien:**
```java
import java.io.File;

public class DateiZugriff {
    public static void main(String[] args) {
        String dateiPfad = "testdatei.txt";
        File datei = new File(dateiPfad);

        if (datei.exists()) {
            System.out.println("Die Datei existiert: " + dateiPfad);
        } else {
            System.out.println("Die Datei existiert nicht: " + dateiPfad);
        }

        // Weitere Verarbeitung mit Streams könnte hier folgen
    }
}
```
## Aufgabe 6: Nullpointer vermeiden
Schreibe ein Programm, das einen String verarbeitet. Stelle sicher, dass keine `NullPointerException` ausgelöst wird.

**Erklärung:**
- Eine `NullPointerException` tritt auf, wenn versucht wird, auf Methoden oder Felder eines Objekts zuzugreifen, das den Wert `null` hat.
- Dies kann durch vorherige Prüfung auf `null` vermieden werden.

**Anforderungen:**
- Prüfe, ob der String `null` ist, bevor du auf ihn zugreifst.
- Gib eine Fehlermeldung aus, falls der String `null` ist.
- Nutze einen `try-catch`-Block, um potenzielle Fehler abzufangen.

## Aufgabe 7: Finally-Block verwenden
Schreibe ein Programm, das eine Verbindung zu einer Datenquelle (z. B. eine Datei) simuliert. Stelle sicher, dass Ressourcen im `finally`-Block freigegeben werden.

**Erklärung:**
- Der `finally`-Block wird immer ausgeführt, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht.
- Typischerweise wird der `finally`-Block genutzt, um Ressourcen wie Streams oder Verbindungen freizugeben.

**Anforderungen:**
- Simuliere das Öffnen und Schließen einer Verbindung.
- Gib im `finally`-Block eine Meldung aus, die angibt, dass die Verbindung geschlossen wurde.

**Tipp:** Du kannst den Zugriff auf eine Datei oder Datenquelle simulieren, ohne tatsächlich eine Datei zu verwenden.

