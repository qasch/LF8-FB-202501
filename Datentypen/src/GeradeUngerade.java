public class GeradeUngerade {
    /* Schreibe ein Programm, das prüft,
    ob eine Zahl gerade oder ungerade ist. */
    public static void main(String[] args) {
        int zahl = 3;

//        if(zahl % 2 == 0) {
//            System.out.println("Die Zahl " + zahl + " ist gerade.");
//        } else {
//            System.out.println("Die Zahl " + zahl + " ist ungerade.");
//        }

        // Lösung mit boolean-Variable
        boolean gerade = (zahl % 2 == 0);
        if(gerade) {
            System.out.println("Die Zahl " + zahl + " ist gerade.");
        } else {
            System.out.println("Die Zahl " + zahl + " ist ungerade.");
        }

    }
}
