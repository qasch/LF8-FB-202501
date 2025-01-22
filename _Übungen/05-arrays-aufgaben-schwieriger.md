# Anspruchsvollere Aufgaben zu Arrays in Java

## Aufgabe 1: Statistik über ein Array
Schreibe ein Programm, das folgende Statistiken über ein Array berechnet:
1. Den Durchschnittswert der Elemente.
2. Das Maximum und das Minimum im Array.
3. Die Anzahl der Werte, die über dem Durchschnitt liegen.

### Anforderungen
- Verwende ein Array mit mindestens 10 Ganzzahlen.
- Die Werte können entweder fest im Code definiert oder über Benutzereingaben gelesen werden.
- Gib die Ergebnisse in einer übersichtlichen Form aus.

### Beispielausgabe
```
Array: [10, 15, 20, 25, 30, 35, 40, 45, 50, 55]
Durchschnitt: 32.5
Maximum: 55
Minimum: 10
Anzahl der Werte über dem Durchschnitt: 5
```

## Aufgabe 2: Rotieren eines Arrays
Implementiere ein Programm, das die Elemente eines Arrays zyklisch nach rechts verschiebt.

### Anforderungen
- Verwende ein Array mit beliebigen Integer-Werten.
- Lasse den Benutzer entscheiden, um wie viele Positionen das Array rotiert werden soll.
- Gib das ursprüngliche und das rotierte Array aus.

### Hinweise
- Eine Rotation nach rechts bedeutet, dass das letzte Element des Arrays an die erste Stelle verschoben wird.
- Beispiel: 
  - Eingabe: `[1, 2, 3, 4, 5]` mit 2 Rotationen
  - Ausgabe: `[4, 5, 1, 2, 3]`

### Beispielausgabe
```
Ursprüngliches Array: [1, 2, 3, 4, 5]
Rotationen: 2
Resultierendes Array: [4, 5, 1, 2, 3]
```

## Aufgabe 3: Matrix-Addition
Schreibe ein Programm, das zwei zweidimensionale Arrays (Matrizen) gleicher Größe addiert und die Ergebnismatrix ausgibt.

### Anforderungen
- Die beiden Matrizen sollten fest im Code definiert sein.
- Verwende Matrizen mit mindestens 3x3 Elementen.
- Gib die beiden Eingabematrizen sowie die Ergebnismatrix in einer übersichtlichen Form aus.

### Hinweise
- Die Addition von Matrizen erfolgt elementweise:
  - Beispiel: 
    ```
    Matrix A:      Matrix B:      Ergebnis:
    [1, 2, 3]      [4, 5, 6]      [5, 7, 9]
    [4, 5, 6]  +   [7, 8, 9]  =   [11, 13, 15]
    [7, 8, 9]      [10, 11, 12]   [17, 19, 21]
    ```

### Beispielausgabe
```
Matrix A:
1 2 3
4 5 6
7 8 9

Matrix B:
4 5 6
7 8 9
10 11 12

Ergebnismatrix:
5 7 9
11 13 15
17 19 21
```
