import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // While-Schleife, die die Zahlen von 1 bis 10
        // untereinander ausgibt
        // Wir können in einer While-Schleife jede beliebige Bedingung angeben.
        // Bzw. nutzen wir eine While-Schleife, wenn wir im Vorfeld *nicht* genau wissen,
        // wie oft wir sie durchlaufen
        // -> Kopfgesteuerte Schleife
        System.out.println("While-Schleife:");
        int number = 1;   // Deklaration und Initialisierung Zählvariable
        while(number <= 10){    // Prüfung Bedingung
            System.out.println(number);
            //number = number + 1;
            number++;  // inkrement -> Wichtig, sonst haben wir eine Endlosschleife
        }

        // Do-While-Schleife
        // Schleifenrumpf wird *auf jeden Fall* einmal durchlaufen,
        // erst dann wird die Bedingung geprüft
        // -> Fussgesteuerte Schleife:

        Scanner sc = new Scanner(System.in);
        // wir werden aufgefordert, eine beliebige Zahl einzugeben,
        // bei Eingabe von 0 wird die Schleife beendet
        int eingabe;  // muss hier ausserhalb der Schleife deklariert werden (-> Scope)
        System.out.println("Do-While Schleife: ");
        do {
            System.out.println("Bitte eine Zahl eingeben, 0 zum beenden: ");
            eingabe = sc.nextInt();
        } while(eingabe != 0);
        //sc.close(); // darf erst hier geschehen, nicht innerhalb der Schleife

        System.out.println("Nach der Do-While Schleife");


        // Gleiche Funktionalität, ohne Do-While:
        // -> mit dem Schlüsselwort break (beendet die Schleife)
        System.out.println("While-Schleife mit break:");
        while(true){  // bewusst gebaute Endlosschleife
            System.out.println("Bitte eine Zahl eingeben, 0 zum beenden: ");
            eingabe = sc.nextInt();
            if(eingabe == 0) {
                break;  // wir beenden die Schleife
            }
        }
        sc.close();
        System.out.println("Nach der While Schleife bzw. Schlüsselwort break");




        System.out.println("\nFor-Schleife:");
        // For-Schleife
        //  for(Zählvariable; Bedingung; In-/Dekrement) {}
        // Wir nutzen eine For-Schleife, wenn wir genau wissen, wie oft die Schleife
        // durchlaufen werden soll (-> Zählschleife)
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

    }
}
