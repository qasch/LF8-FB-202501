import java.util.Scanner;   // wir importieren die Klasse Scanner

public class VerzweigungScanner {
    /*
    Schreibe ein Programm, das zwei Zahlen a und b
    vergleicht und die größere Zahl ausgibt.
    Die Eingabe der Zahlen soll interaktiv als Benutzereingabe
    erfolgen.
    */
    public static void main(String[] args) {

        int a, b;   // Deklaration der Variablen a und b, keine Wertzuweisung (Initialisierung)

        Scanner scanner = new Scanner(System.in);   // Erzeugung des Objekts/Instanz scanner

        System.out.print("Bitte eine Zahl a eingeben: ");
        a = scanner.nextInt();
        System.out.print("Bitte eine Zahl b eingeben: ");
        b = scanner.nextInt();

        scanner.close();  // Scanner schliessen um Ressourcen freizugeben (Best Practice)

        if(a > b) {  // true
            System.out.println("a (" + a + ") ist grösser als b (" + b + ").");
        } else if (a < b) {   // wird gar nicht mehr geprüft, da obiges if schon true
            System.out.println("b (" + b + ") ist grösser als a (" + a + ").");
        } else {
            System.out.println("a (" + a + ") ist gleich b (" + b + ").");
        }
    }
}
