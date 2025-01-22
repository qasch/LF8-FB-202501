# Referenz: Arrays in Java

## Einführung in Arrays
Ein Array ist eine Datenstruktur, die eine feste Anzahl von Werten desselben Typs speichern kann. Die Größe eines Arrays wird bei der Initialisierung festgelegt und kann später nicht geändert werden.

**Beispiel:**
```java
int[] zahlen = new int[5]; // Ein Array mit 5 Integer-Werten
```

---

## Array-Deklaration und -Initialisierung
### Deklaration
Ein Array kann folgendermaßen deklariert werden:
```java
datentyp[] arrayName;
```

### Initialisierung
Arrays können auf zwei Arten initialisiert werden:

1. **Direkte Initialisierung mit Werten:**
```java
int[] zahlen = {1, 2, 3, 4, 5};
```

2. **Initialisierung mit der `new`-Syntax:**
```java
int[] zahlen = new int[5]; // Platz für 5 Integer-Werte, Standardwerte sind 0
```

---

## Zugriff auf Array-Elemente
Auf einzelne Elemente eines Arrays kann mit ihrem Index zugegriffen werden. Indizes starten bei 0.

**Beispiel:**
```java
int[] zahlen = {10, 20, 30};
System.out.println(zahlen[0]); // Gibt 10 aus
zahlen[1] = 25; // Ändert den Wert des zweiten Elements auf 25
```

---

## Schleifen mit Arrays
### Iteration mit einer `for`-Schleife
```java
int[] zahlen = {10, 20, 30};
for (int i = 0; i < zahlen.length; i++) {
    System.out.println(zahlen[i]);
}
```

### Iteration mit einer `for-each`-Schleife
```java
int[] zahlen = {10, 20, 30};
for (int zahl : zahlen) {
    System.out.println(zahl);
}
```

---

## Standardwerte in Arrays
Die Elemente eines Arrays haben folgende Standardwerte:
- `int`, `short`, `long`, `byte`: `0`
- `float`, `double`: `0.0`
- `boolean`: `false`
- Referenztypen (z. B. `String`): `null`

---

## Zweidimensionale Arrays
Ein zweidimensionales Array kann als Tabelle oder Matrix betrachtet werden.

### Deklaration und Initialisierung
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Zugriff auf Elemente
```java
System.out.println(matrix[1][2]); // Gibt 6 aus (Zeile 1, Spalte 2)
```

### Iteration über ein zweidimensionales Array
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

**Ausgabe:**
```
1 2 3 
4 5 6 
7 8 9 
```

---

## Wichtige Array-Methoden

### `Arrays.toString()`
Wandelt ein Array in eine lesbare Zeichenkette um:
```java
import java.util.Arrays;
int[] zahlen = {1, 2, 3};
System.out.println(Arrays.toString(zahlen));
```
**Ausgabe:**
```
[1, 2, 3]
```

### `Arrays.sort()`
Sortiert ein Array:
```java
import java.util.Arrays;
int[] zahlen = {3, 1, 2};
Arrays.sort(zahlen);
System.out.println(Arrays.toString(zahlen));
```
**Ausgabe:**
```
[1, 2, 3]
```

---

## Häufige Fehler bei Arrays
1. **IndexOutOfBoundsException:**
   - Tritt auf, wenn versucht wird, auf einen Index zuzugreifen, der außerhalb des Array-Bereichs liegt.
   - Beispiel:
     ```java
     int[] zahlen = {1, 2, 3};
     System.out.println(zahlen[3]); // Fehler: Index 3 existiert nicht
     ```

2. **NullPointerException:**
   - Tritt auf, wenn versucht wird, auf ein nicht initialisiertes Array zuzugreifen.
   - Beispiel:
     ```java
     int[] zahlen = null;
     System.out.println(zahlen[0]); // Fehler
     ```

