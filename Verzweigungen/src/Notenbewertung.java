public class Notenbewertung {
    /*
     Schreibe ein Programm, das eine Schulnote (1–6)
     einliest und den passenden Kommentar ausgibt
     */
    public static void main(String[] args) {
        int eingabe = 5;

        if (eingabe == 1) {
            System.out.println("Sehr gut");
        } else if(eingabe == 2){
            System.out.println("Gut");
        } else if (eingabe == 3) {
            System.out.println("Befriedigend");
        } else if (eingabe == 4) {
            System.out.println("Ausreichend");
        } else if (eingabe == 5) {
            System.out.println("Mangelhaft");
        } else if (eingabe == 6) {
            System.out.println("Ungenügend");
        } else {
            System.out.println("Ungültige Eingabe");
        }
    }
}
