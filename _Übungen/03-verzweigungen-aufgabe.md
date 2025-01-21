# Aufgaben: Verzweigungen in Java

> [!NOTE]
> Für diese Übungen könnt ihr die einzulesenden Werte entweder *interaktiv* über den `Scanner` einlesen, oder die Werte *hart kodiert* direkt im Code erstellen.
> Trefft diese Entscheidung eigenständig. Es ist in der Regel besser, sich zuerst auf die Logik zu konzentrieren und *Verbesserungen* am Code später hinzuzufügen (-> *Refactoring*). Generell möchte man immer die Komplexität anfangs so gering wie möglich halten und erst nach und nach schrittweise erhöhen.

## Aufgabe 1: Größere Zahl finden
Schreibe ein Programm, das zwei Zahlen `a` und `b` vergleicht und die größere Zahl ausgibt.

> [!NOTE]
> - Du kannst die Zahlen direkt im Code initialisieren oder vom Benutzer eingeben lassen.
> - Nutze eine einfache `if-else`-Abfrage, um die Werte zu vergleichen.

## Aufgabe 2: Temperatur überprüfen
Schreibe ein Programm, das eine Temperatur in Grad Celsius einliest und überprüft:
- Ist die Temperatur unter 0? Ausgabe: "Es friert."
- Liegt die Temperatur zwischen 0 und 30? Ausgabe: "Angenehmes Wetter."
- Ist die Temperatur über 30? Ausgabe: "Es ist heiß."

> [!NOTE]
> - Nutze mehrere `if-else`-Bedingungen, um die Bereiche zu prüfen.

## Aufgabe 3: Altersüberprüfung
Schreibe ein Programm, das das Alter eines Benutzers überprüft und ausgibt, ob er volljährig ist oder nicht.

> [!NOTE]
> - Teste das Programm mit unterschiedlichen Altersangaben.

## Aufgabe 4: Notenbewertung
Schreibe ein Programm, das eine Schulnote (1–6) einliest und den passenden Kommentar ausgibt:
- `1`: "Sehr gut"
- `2`: "Gut"
- `3`: "Befriedigend"
- `4`: "Ausreichend"
- `5`: "Mangelhaft"
- `6`: "Ungenügend"

> [!Note]
> - Du kannst diese Aufgabe wie gewohnt über ein `if/if else` Statement lösen oder eine `switch`-Anweisung verwenden.
> - Recherchiere dazu selbstständig, wie eine `switch`-Anweisung funktioniert und wie du sie verwenden kannst.
> - Überlege, was passiert, wenn die Eingabe nicht im Bereich 1–6 liegt.

## Aufgabe 5: Login-System
Schreibe ein Programm, das Benutzername und Passwort prüft. Nur wenn beide korrekt sind, soll "Login erfolgreich" ausgegeben werden. Andernfalls "Login fehlgeschlagen".

> [!NOTE] 
> - Lege die korrekten Werte für Benutzername und Passwort direkt im Code fest.
> - Teste das Programm mit verschiedenen Eingaben.

## Aufgabe 6: Schaltjahr prüfen
Schreibe ein Programm, das überprüft, ob ein eingegebenes Jahr ein Schaltjahr ist. Ein Jahr ist ein Schaltjahr, wenn:
- Es durch 4 teilbar ist und
- nicht durch 100 teilbar ist, außer es ist durch 400 teilbar.

> [!NOTE]
> - Nutze eine Kombination aus `if`, `else if` und `else`, um die Bedingungen zu prüfen.

## Aufgabe 7: Dreieckstyp bestimmen
Schreibe ein Programm, das die drei Seiten eines Dreiecks einliest und bestimmt, ob das Dreieck gleichseitig, gleichschenklig oder ungleichseitig ist.

> [!NOTE]
> - Ein Dreieck ist gleichseitig, wenn alle drei Seiten gleich lang sind.
> - Es ist gleichschenklig, wenn genau zwei Seiten gleich lang sind.
> - Es ist ungleichseitig, wenn alle Seiten unterschiedlich sind.

## Aufgabe 8: Zahlen sortieren
Schreibe ein Programm, das drei Zahlen einliest und diese in aufsteigender Reihenfolge ausgibt.

> [!NOTE]
> - Verwende mehrere `if-else`-Bedingungen, um die Zahlen zu sortieren.
> - Teste das Programm mit unterschiedlichen Kombinationen von Zahlen.

## Aufgabe 9: Positiv, negativ oder null
Schreibe ein Programm, das prüft, ob eine eingegebene Zahl positiv, negativ oder null ist.

> [!NOTE]
> - Nutze eine einfache `if-else`-Struktur.

## Aufgabe 10: Wochenendprüfung
Schreibe ein Programm, das den Namen eines Wochentags einliest und überprüft, ob es ein Arbeitstag oder Wochenende ist.
- Wochenende: Samstag, Sonntag
- Arbeitstag: Montag bis Freitag

> [!NOTE]
> - Du kannst auch hier eine `switch`-Anweisung oder mehrere `if-else`-Bedingungen verwenden.
> - Achte darauf, die Eingabe des Benutzers zu *normalisieren* (z. B. Groß- und Kleinschreibung).

