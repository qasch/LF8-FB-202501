public class DatentypenKette {
    /* Erstelle eine byte-Variable mit einem Wert zwischen 0 und 127.
    Konvertiere die byte-Variable:
    - Zuerst in einen short.
    - Dann in einen int.
    - Schließlich wieder in einen double.
    Gib alle Variablenwerte nach jeder Konvertierung aus. */

    public static void main(String[] args) {
        byte myByte = 111;
        // Casting
        short myShort = (short) myByte;
        int myInt = (int) myShort;
        double myDouble = (double) myInt;

        /* Alles funktioniert, da wir mit dem "kleinsten" Datentyp
           beginnen, also immer genug "Platz" im nächsten Datentyp haben.
         */
        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
    }
}
