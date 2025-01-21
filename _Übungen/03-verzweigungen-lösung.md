# Lösungen: Verzweigungen in Java

## Aufgabe 1: Größere Zahl finden
```java
public class GroessereZahl {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a > b) {
            System.out.println("Die größere Zahl ist: " + a);
        } else {
            System.out.println("Die größere Zahl ist: " + b);
        }
    }
}
```

## Aufgabe 2: Temperatur überprüfen
```java
import java.util.Scanner;

public class TemperaturCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Temperatur in Grad Celsius ein: ");
        int temperatur = scanner.nextInt();

        if (temperatur < 0) {
            System.out.println("Es friert.");
        } else if (temperatur <= 30) {
            System.out.println("Angenehmes Wetter.");
        } else {
            System.out.println("Es ist heiß.");
        }
    }
}
```

## Aufgabe 3: Altersüberprüfung
```java
import java.util.Scanner;

public class AltersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        if (alter >= 18) {
            System.out.println("Sie sind volljährig.");
        } else {
            System.out.println("Sie sind nicht volljährig.");
        }
    }
}
```

## Aufgabe 4: Notenbewertung
```java
import java.util.Scanner;

public class Notenbewertung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Note (1-6) ein: ");
        int note = scanner.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }
    }
}
```

## Aufgabe 5: Login-System
```java
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String korrekterBenutzername = "admin";
        String korrektesPasswort = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Benutzername: ");
        String benutzername = scanner.nextLine();
        System.out.print("Passwort: ");
        String passwort = scanner.nextLine();

        if (benutzername.equals(korrekterBenutzername) && passwort.equals(korrektesPasswort)) {
            System.out.println("Login erfolgreich");
        } else {
            System.out.println("Login fehlgeschlagen");
        }
    }
}
```

## Aufgabe 6: Schaltjahr prüfen
```import java.util.Scanner;

public class SchaltjahrCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Jahr ein: ");
        int jahr = scanner.nextInt();

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }
    }
}
```

## Aufgabe 7: Dreieckstyp bestimmen
```java
import java.util.Scanner;

public class Dreieckstyp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Seite ein: ");
        int a = scanner.nextInt();
        System.out.print("Geben Sie die zweite Seite ein: ");
        int b = scanner.nextInt();
        System.out.print("Geben Sie die dritte Seite ein: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Das Dreieck ist gleichseitig.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Das Dreieck ist gleichschenklig.");
        } else {
            System.out.println("Das Dreieck ist ungleichseitig.");
        }
    }
}
```

## Aufgabe 8: Zahlen sortieren
```java
import java.util.Scanner;

public class ZahlenSortieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        int a = scanner.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int b = scanner.nextInt();
        System.out.print("Geben Sie die dritte Zahl ein: ");
        int c = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Sortierte Reihenfolge: " + a + ", " + b + ", " + c);
    }
}
```

## Aufgabe 9: Positiv, negativ oder null
```java
import java.util.Scanner;

public class ZahlPruefen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        if (zahl > 0) {
            System.out.println("Die Zahl ist positiv.");
        } else if (zahl < 0) {
            System.out.println("Die Zahl ist negativ.");
        } else {
            System.out.println("Die Zahl ist null.");
        }
    }
}
```

## Aufgabe 10: Wochenendprüfung
```java
import java.util.Scanner;

public class WochenendCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Wochentag ein: ");
        String tag = scanner.nextLine().toLowerCase();

        if (tag.equals("samstag") || tag.equals("sonntag")) {
            System.out.println("Es ist Wochenende.");
        } else if (tag.equals("montag") || tag.equals("dienstag") || tag.equals("mittwoch") || 
                   tag.equals("donnerstag") || tag.equals("freitag")) {
            System.out.println("Es ist ein Arbeitstag.");
        } else {
            System.out.println("Ungültige Eingabe.");
        }
    }
}
```
