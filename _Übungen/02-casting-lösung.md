# Lösungen: Casting in Java

> [!NOTE] 
> Die Lösungen sind in ausführlicherer Form auch im Verzeichnis [`Casting`](../Casting/src) zu finden.

## Lösung 1: Implizites Casting
```java
public class Main {
    public static void main(String[] args) {
        int myInt = 42;
        double myDouble = myInt; // Implizites Casting
        System.out.println("int-Wert: " + myInt);
        System.out.println("double-Wert: " + myDouble);
    }
}
```
## Lösung 2: Explizites Casting
```java
public class Main {
    public static void main(String[] args) {
        double myDouble = 15.75;
        int myInt = (int) myDouble; // Explizites Casting
        System.out.println("double-Wert: " + myDouble);
        System.out.println("int-Wert: " + myInt);
    }
}
```

## Lösung 3: Datentypen-Kette
```java
public class Main {
    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = myByte; // Implizites Casting
        int myInt = myShort;   // Implizites Casting
        double myDouble = myInt; // Implizites Casting

        System.out.println("byte-Wert: " + myByte);
        System.out.println("short-Wert: " + myShort);
        System.out.println("int-Wert: " + myInt);
        System.out.println("double-Wert: " + myDouble);
    }
}
```

## Lösung 4: Narrowing Casting mit Verlust
```java
public class Main {
    public static void main(String[] args) {
        float myFloat = 12345.6789f;
        long myLong = (long) myFloat; // Explizites Casting
        short myShort = (short) myLong; // Explizites Casting

        System.out.println("float-Wert: " + myFloat);
        System.out.println("long-Wert: " + myLong);
        System.out.println("short-Wert: " + myShort);
    }
}
```

## Lösung 5: Fehler beim Casting
```java
public class Main {
    public static void main(String[] args) {
        double myDouble = 1.0E20;
        int myInt = (int) myDouble; // Explizites Casting mit Verlust
        System.out.println("double-Wert: " + myDouble);
        System.out.println("int-Wert: " + myInt); // Werteverlust
    }
}
```

## Lösung 6: Wertebereich testen
```java
public class Main {
    public static void main(String[] args) {
        long myLong = 2147483648L; // Außerhalb des int-Bereichs
        int myInt = (int) myLong; // Explizites Casting mit Überlauf
        System.out.println("long-Wert: " + myLong);
        System.out.println("int-Wert: " + myInt); // Überlauf
    }
}
```
 
## Lösung 7: Fehlerhafte Konvertierung
```java
public class Main {
    public static void main(String[] args) {
        String myString = "123abc"; // Nicht konvertierbarer String
        try {
            int myInt = Integer.parseInt(myString); // Fehler
            System.out.println("int-Wert: " + myInt);
        } catch (NumberFormatException e) {
            System.out.println("Fehler: Der String kann nicht in eine Zahl konvertiert werden.");
        }
    }
}
```
