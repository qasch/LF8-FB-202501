public class WertebereichTesten {
    /*
     - Erstelle eine long-Variable mit einem Wert, der außerhalb des Bereichs eines int
       liegt. Recherchiere dazu die Wertebereiche der Primitives in Java.
     - Konvertiere die long-Variable explizit in einen int.
     - Gib das Ergebnis auf der Konsole aus und erkläre den Effekt.
     */

    public static void main(String[] args) {
        // Unterstriche ersetzen die uns gewohnten Punkte bei grossen Zahlen
        long tooBigForIntLong = 300_000_000_000L; // Long: 2^63 - 1 Bit, Int: 32 Bit (2_147_483_647)
        int tooBigForIntInt = (int) tooBigForIntLong;

        System.out.println("tooBigForIntLong: " + tooBigForIntLong);
        System.out.println("tooBigForIntInt: " + tooBigForIntInt);
   }
}
