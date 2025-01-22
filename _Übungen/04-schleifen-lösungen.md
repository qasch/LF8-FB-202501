# Lösungen zu den Übungen: Schleifen in Java

Hier sind die Lösungen zu den Übungen aus dem Dokument "Übungen zu Schleifen in Java".

---

## **1. Zahlen von 1 bis 10 ausgeben**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
```
**Erweiterung (untereinander ausgeben):**
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

---

## **2. Summieren von Zahlen**
```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Die Summe der Zahlen von 1 bis 100 ist: " + sum);
    }
}
```
**Erweiterung (Obergrenze vom Benutzer eingeben):**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die Obergrenze ein: ");
        int limit = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("Die Summe der Zahlen von 1 bis " + limit + " ist: " + sum);
    }
}
```

---

## **3. Gerade Zahlen ausgeben**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```
**Erweiterung (Start- und Endzahl eingeben):**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die Startzahl ein: ");
        int start = scanner.nextInt();

        System.out.print("Gib die Endzahl ein: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

---

## **4. Benutzer-Eingaben summieren**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Gib eine Zahl ein (0 zum Beenden): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Die Summe der eingegebenen Zahlen ist: " + sum);
    }
}
```

---

## **5. Zahlenraten-Spiel**
```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Rate die Zahl (zwischen 1 und 100): ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Zu niedrig!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Zu hoch!");
            }
        } while (userGuess != numberToGuess);

        System.out.println("Herzlichen Glückwunsch! Du hast die Zahl in " + attempts + " Versuchen erraten.");
    }
}
```

---

## **6. Umgekehrte Zeichenfolge**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zeichenfolge ein: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Umgekehrte Zeichenfolge: " + reversed);
    }
}
```
**Erweiterung (Palindromprüfung):**
```java
if (input.equals(reversed)) {
    System.out.println("Die Zeichenfolge ist ein Palindrom.");
} else {
    System.out.println("Die Zeichenfolge ist kein Palindrom.");
}
```

---

## **7. Einfaches Menü mit Schleifen**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenü:");
            System.out.println("1. Zahlen summieren");
            System.out.println("2. Multiplikationstabelle anzeigen");
            System.out.println("3. Programm beenden");
            System.out.print("Wähle eine Option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Funktion: Zahlen summieren");
                    break;
                case 2:
                    System.out.println("Funktion: Multiplikationstabelle anzeigen");
                    break;
                case 3:
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Option!");
            }
        } while (choice != 3);
    }
}
```

---

## **8. FizzBuzz**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

---

## **9. Multiplikationstabelle**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
```
**Erweiterung (Benutzerdefinierte Zahl):**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
```

---

## **10. Einfache Sternmuster**
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
**Erweiterung (Benutzerdefinierte Zeilenanzahl):**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die Anzahl der Zeilen ein: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

