# **Schleifen in Java**

## **1. Arten von Schleifen in Java**

### **1.1 `while`-Schleife**
Die `while`-Schleife wird verwendet, wenn die Anzahl der Iterationen (hier: Durchläufe) nicht bekannt ist und die Ausführung von einer *beliebigen* Bedingung abhängt. Der Codeblock wird so lange ausgeführt, wie die Bedingung `true` ist. Wenn die Bedingung von Anfang an `false` ist, wird der Codeblock **kein einziges Mal** ausgeführt. Die `while`-Schleife wird auch *Kopfgesteuerte Schleife* genannt.

**Syntax:**
```java
while (Bedingung) {
    // Codeblock
}
```

**Beispiel:** Eine Zahl so lange verdoppeln, solange sie kleiner als 100 ist:
```java
public class Main {
    public static void main(String[] args) {
        int zahl = 1;
        while (zahl <= 100) {
            System.out.println(zahl);
            zahl *= 2;
        }
    }
}
```

**Erklärung:**
- Die Variable `zahl` wird mit dem Wert `1` initialisiert.
- Die Bedingung `zahl <= 100` wird überprüft. Solange sie wahr ist, wird der Codeblock ausgeführt.
- Innerhalb des Codeblocks wird der Wert von `zahl` verdoppelt.
- Sobald `zahl` größer als `100` ist, endet die Schleife.

### **1.2 `do-while`-Schleife**
Die `do-while`-Schleife garantiert, dass der Codeblock mindestens einmal ausgeführt wird, da die Bedingung erst am Ende der Schleife geprüft wird. Die `do-while`-Schleife wird auch *Fussgesteuerte Schleife* genannt.

**Syntax:**
```java
do {
    // Codeblock
} while (Bedingung);
```

**Beispiel:** Benutzer wiederholt zur Eingabe einer Zahl auffordern, bis er `0` eingibt:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl;

        do {
            System.out.print("Gib eine Zahl ein (0 zum Beenden): ");
            zahl = scanner.nextInt();
        } while (zahl != 0);

        System.out.println("Programm beendet.");
    }
}
```

**Erklärung:**
- Der Codeblock innerhalb von `do` wird immer mindestens einmal ausgeführt, selbst wenn der Benutzer direkt "0" eingibt.
- Nach jeder Iteration wird die Bedingung `zahl != 0` geprüft. Ist sie wahr, wird die Schleife fortgesetzt.
- Diese Schleife eignet sich besonders für Situationen, in denen mindestens eine Aktion ausgeführt werden muss, bevor die Bedingung geprüft wird.

### **1.3 `for`-Schleife**
Die `for`-Schleife wird verwendet, wenn die Anzahl der Iterationen vorab bekannt ist. Sie ist kompakt und ermöglicht die Initialisierung, Bedingung und Aktualisierung in einer einzigen Zeile.

**Syntax:**
```java
for (Initialisierung; Bedingung; Aktualisierung) {
    // Codeblock
}
```

**Beispiel:** Zahlen von 1 bis 10 ausgeben:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

**Erklärung:**
- `Initialisierung`: Die Schleifenvariable `i` wird mit `1` initialisiert.
- `Bedingung`: Die Schleife wird ausgeführt, solange `i <= 10` ist.
- `Aktualisierung`: Nach jeder Iteration wird `i` um `1` erhöht.
- Diese Schleife ist ideal für feste Iterationszahlen.

### **1.4 `for-each`-Schleife**
Die `for-each`-Schleife ist speziell für Iterationen über *Artays* und *Collections* gedacht. Sie ist lesbarer und vor allem weniger fehleranfällig, da keine Indexverwaltung erforderlich ist (-> *IndexOutOfBound Exception*).

**Syntax:**
```java
for (Datentyp Element : Array/Collection) {
    // Codeblock
}
```

**Beispiel:** Alle Elemente eines Arrays ausgeben mit einer `for-each` Schleife:
```java
public class Main {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5};

        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
    }
}
```

**Beispiel:** Alle Elemente eines Arrays ausgeben mit einer `for` Schleife:
```java
public class Main {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5};

        // hier kann es zu einem Fehler kommen, wenn z.B. anstatt des < Operators der <= Operator verwendet wird
        for (int zahl=0; zahl < zahlen.length; zahl++) {  
            System.out.println(zahl);
        }
    }
}
```

**Erklärung:**
- Die Schleifenvariable `zahl` durchläuft jedes Element des Arrays `zahlen`.
- Diese Schleife eignet sich besonders für das Durchlaufen von Datenstrukturen wie Arrays oder Listen.

## **2. Wichtige Kontrollanweisungen**

### **2.1 `break`**
`break` wird verwendet, um die Schleife vorzeitig zu beenden. Dies ist nützlich, wenn ein bestimmtes Ereignis eintritt und weitere Iterationen nicht notwendig sind.

**Beispiel:** Schleife beenden, wenn ein bestimmter Wert erreicht wird:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

**Erklärung:**
- Sobald `i == 5`, wird die Schleife mit `break` beendet.
- Die Werte `1` bis `4` werden ausgegeben, danach endet die Schleife.

---

### **2.2 `continue`**
`continue` überspringt die aktuelle Iteration und fährt mit der nächsten fort. Dies ist hilfreich, wenn bestimmte Bedingungen innerhalb der Schleife ignoriert werden sollen.

**Beispiel:** Nur ungerade Zahlen ausgeben:
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println(i);
}
```

**Erklärung:**
- Wenn `i` eine gerade Zahl ist, wird der Codeblock nach `continue` übersprungen.
- Nur ungerade Zahlen werden ausgegeben.

---

## **3. Verschachtelte Schleifen**
Schleifen können ineinander verschachtelt werden, um komplexere Aufgaben zu lösen. Dies ist beispielsweise nützlich, wenn es um die Verarbeitung von zweidimensionalen Daten geht.

**Beispiel:** Ein Bild aus Punkten darstellen:
```java
public class Main {
    public static void main(String[] args) {
        int breite = 5;
        int hoehe = 3;

        for (int y = 0; y < hoehe; y++) {
            for (int x = 0; x < breite; x++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
```

**Erklärung:**
- Die äußere Schleife (`y`) steuert die Zeilen.
- Die innere Schleife (`x`) steuert die Spalten (Punkte) in jeder Zeile.
- Es wird ein Rechteck mit `5` Punkten Breite und `3` Punkten Höhe ausgegeben.


## **5. Häufige Fehler und deren Vermeidung**

### **5.1 Endlosschleifen**
Fehlerhafte Bedingungen können zu Endlosschleifen führen:
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // i++; fehlt hier
}
```
**Lösung:** Überprüfe, ob die Bedingung angepasst wird.

### **5.2 Off-by-One-Fehler**
Ein häufiger Fehler ist das falsche Starten oder Beenden der Schleife.

**Beispiel:**
```java
for (int i = 1; i < 10; i++) {
    System.out.println(i);
} // Gibt nur bis 9 aus
```
**Lösung:** Überprüfe die Bedingung (`i <= 10` anstatt `i < 10`).

