public class Konstanten {
    /* Schreibe ein Programm, das eine Konstante für die
    Mehrwertsteuer verwendet und den Bruttobetrag eines
    Einkaufs berechnet. */
    public static void main(String[] args) {
        final double MWST = 0.19;
        // MWST = 4;   // das hier geht jetzt nicht mehr!
        double nettoBetrag = 50.0;
        double bruttoBetrag = nettoBetrag * (1 + MWST);

        System.out.println("Bruttobetrag: " + bruttoBetrag);
        System.out.println("Nettobetrag: " + nettoBetrag);
    }
}
