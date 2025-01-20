public class ZahlenVergleichen {
    /* Schreibe ein Programm, das überprüft,
    welche von zwei Zahlen größer ist. */
    public static void main(String[] args) {
        int zahl1 = 47;
        int zahl2 = 42;

        if(zahl1 > zahl2){  // true -> dieser if-Zweig wird ausgeführt
            System.out.println("Zahl 1: " + zahl1 + " ist grösser als Zahl 2: " + zahl2);
        } else if(zahl1 < zahl2) { // false -> dieser else-if-Zweig wird *nicht* ausgeführt
            System.out.println("Zahl 1: " + zahl1 + " ist kleiner als Zahl 2: " + zahl2);
        } else { // false -> dieser else-Zweig wird *nicht* ausgeführt
            System.out.println("Zahl 1: " + zahl1 + " ist gleich Zahl 2: " + zahl2);
        }
    }
}
