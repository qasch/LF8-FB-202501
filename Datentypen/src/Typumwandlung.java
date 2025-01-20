public class Typumwandlung {
    /* Schreibe ein Programm, das eine Variable vom Typ double
    in eine Variable vom Typ int umwandelt. */
    public static void main(String[] args) {
        double doubleZahl = 45.78;
        // explizites Casting:
        int intZahl = (int) doubleZahl;

        System.out.println("doubleZahl: " + doubleZahl);
        System.out.println("intZahl: " + intZahl);
    }
}
