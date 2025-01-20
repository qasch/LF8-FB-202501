public class Narrowing {
    /* - Deklariere eine float-Variable mit dem Wert 12345.6789.
       - Konvertiere die Variable explizit in eine long-Variable und dann in eine short-Variable.
       - Gib die Werte nach jedem Schritt auf der Konsole aus.
       - Beobachte und erkläre, was mit den Daten passiert.
    */

    public static void main(String[] args) {
        float myFloat = 12345.6789F;   // F ist nötig, sonst ist es ein double
        System.out.println("myFloat: " + myFloat);  // Float: 32 Bit

        long myLong = (long) myFloat;  // Long: 64 Bit
        System.out.println("myLong: " + myLong);

        short myShort = (short) myLong;  // Short: 16 Bit
        System.out.println("myShort: " + myShort);
    }
}
