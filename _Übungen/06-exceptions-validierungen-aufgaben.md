# Übungen zu Exceptions in Java

## Aufgabe 1: Division durch Null
Schreibe ein Programm, das zwei Zahlen von der Konsole einliest und die Division der beiden Zahlen durchführt. Stelle sicher, dass keine Division durch null erfolgt.

**Anforderungen:**
- Prüfe, ob der Benutzer den Wert `0` als Divisor eingibt.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls der Divisor `0` ist.
- Wirf eine `ArithmeticException`, falls der Benutzer dennoch versucht, durch null zu teilen.

## Aufgabe 2: Array-Index validieren
Schreibe ein Programm, das ein Array von 5 Zahlen enthält. Lass den Benutzer den Index der Zahl eingeben, die er anzeigen möchte. Stelle sicher, dass der Index gültig ist.

**Anforderungen:**
- Prüfe, ob der eingegebene Index im Bereich von 0 bis 4 liegt.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls der Index ungültig ist.
- Wirf eine `ArrayIndexOutOfBoundsException`, falls der Benutzer einen ungültigen Index angibt.

## Aufgabe 3: Ganzzahl-Eingaben validieren
Schreibe ein Programm, das den Benutzer auffordert, eine Ganzzahl einzugeben. Stelle sicher, dass die Eingabe tatsächlich eine Ganzzahl ist.

**Anforderungen:**
- Prüfe die Eingabe mit einer Methode.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls die Eingabe keine Ganzzahl ist.

**Tipp:** Verwende einen `try-catch`-Block, um Eingabe-Fehler (z. B. `InputMismatchException`) zu behandeln.

## Aufgabe 4: Zahl innerhalb eines Bereichs prüfen
Schreibe ein Programm, das den Benutzer auffordert, eine Zahl zwischen 1 und 100 einzugeben. Stelle sicher, dass die Zahl in diesem Bereich liegt.

**Anforderungen:**
- Prüfe, ob die eingegebene Zahl im Bereich liegt.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls die Zahl außerhalb des Bereichs liegt.

## Aufgabe 5: Validierung von Benutzernamen
Schreibe ein Programm, das den Benutzer auffordert, einen Benutzernamen einzugeben. Stelle sicher, dass der Benutzername mindestens 5 Zeichen lang ist.

**Anforderungen:**
- Prüfe die Länge des eingegebenen Benutzernamens.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls der Benutzername zu kurz ist.

## Aufgabe 6: Passwortprüfung
Schreibe ein Programm, das ein Passwort vom Benutzer einliest und prüft, ob es folgende Kriterien erfüllt:
1. Mindestens 8 Zeichen lang.
2. Enthält mindestens eine Zahl.

**Anforderungen:**
- Gib eine Fehlermeldung aus, falls eines der Kriterien nicht erfüllt ist.
- Fordere den Benutzer auf, ein neues Passwort einzugeben.

**Tipp:** Verwende die Methode `String.matches()` mit einem passenden regulären Ausdruck, um die Kriterien zu prüfen.

## Aufgabe 7: Gültiges Datum eingeben
Schreibe ein Programm, das den Benutzer auffordert, ein Datum im Format `YYYY-MM-DD` einzugeben. Stelle sicher, dass das Datum korrekt formatiert ist.

**Anforderungen:**
- Prüfe, ob die Eingabe dem Format entspricht.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls das Format ungültig ist.

**Tipp:** Du kannst die Klasse `LocalDate` und die Methode `parse` mit einem passenden `DateTimeFormatter` verwenden.

## Aufgabe 8: Zahlenpaare validieren
Schreibe ein Programm, das zwei Zahlenpaare einliest (x1, y1 und x2, y2). Stelle sicher, dass keine Zahl negativ ist.

**Anforderungen:**
- Prüfe jede Zahl auf Negativität.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls eine Zahl negativ ist.

**Tipp:** Nutze Schleifen, um jede Zahl des Zahlenpaars einzeln zu prüfen, und informiere den Benutzer über die fehlerhafte Eingabe.

## Aufgabe 9: Telefonnummer validieren
Schreibe ein Programm, das den Benutzer auffordert, eine Telefonnummer einzugeben. Stelle sicher, dass die Telefonnummer nur Ziffern enthält und genau 10 Zeichen lang ist.

**Anforderungen:**
- Prüfe die Eingabe auf Länge und Inhalt.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls die Telefonnummer ungültig ist.

**Tipp:** Du kannst die Methode `String.matches()` verwenden, um sicherzustellen, dass nur Ziffern in der Eingabe enthalten sind.

## Aufgabe 10: Email-Adresse prüfen
Schreibe ein Programm, das den Benutzer auffordert, eine Email-Adresse einzugeben. Stelle sicher, dass die Email-Adresse ein `@`-Symbol und einen Punkt enthält.

**Anforderungen:**
- Prüfe die Eingabe auf das Vorhandensein eines `@`-Symbols und eines Punktes.
- Gib eine Fehlermeldung aus und fordere eine neue Eingabe, falls die Email-Adresse ungültig ist.

**Tipp:** Überprüfe, ob die Position des `@`-Symbols vor dem Punkt liegt und beide vorhanden sind.

