public class FehlerBeimCasting {
    /*
     - Erstelle eine double-Variable mit einem sehr großen Wert, z. B. 2.0E20.
     - Konvertiere diese Variable explizit in einen int.
     - Beobachte, was passiert, und versuche zu erklären, warum dies geschieht.
    */

    public static void main(String[] args) {
        double veryBigDouble = 2.0E20;
        int veryBigDoubleInt = (int) veryBigDouble;

        System.out.println("veryBigDouble: " + veryBigDouble);
        System.out.println("veryBigDoubleInt: " + veryBigDoubleInt);
    }
}
