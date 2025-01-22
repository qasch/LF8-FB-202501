public class Sternmuster {
    /* Schreibe ein Programm, das ein Sternmuster ausgibt */
    public static void main(String[] args) {
        // Zeilen
        int zeilen = 5;
        for(int i=1; i<=zeilen; i++){
            // Spalten
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
