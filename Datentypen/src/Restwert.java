public class Restwert {
    /* Schreibe ein Programm, das den Restwert einer Division berechnet */
    public static void main(String[] args) {
       int dividend = 15;
       int divisor = 4;

       // Der Modulo-Operator % gibt ausschliesslich den Restwert einer
       // ganzzahligen Divison zurück
       int restwert = dividend % divisor;

        System.out.println("Der Restwert der Division von " + dividend + " und "
                + divisor + " ist " + restwert);
    }
}
