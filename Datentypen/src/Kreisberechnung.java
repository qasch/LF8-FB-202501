public class Kreisberechnung {
    /* Schreibe ein Programm, das den Umfang
    und die Fläche eines Kreises berechnet. */
    public static void main(String[] args) {
        // da alle Variblen vom gleichen Datentyp
        // sind, können wir die Deklaration auch in
        // einer Zeile machen:
        double radius, pi, umfang, flaeche;

        // hier initialisieren wir die Variablen
        // mit ihren jeweiligen Werten
        radius = 7.5;
        pi = 3.14;
        // der Teil auf der rechten Seite des
        // Zuweisungsoperators ist ein
        // sogenannter "Ausdruck"
        umfang = 2 * pi * radius;
        flaeche = pi * radius * radius;

        System.out.println("Umfang: " + umfang + " cm");
        System.out.println("Fläche: " + flaeche + " cm");
    }
}
