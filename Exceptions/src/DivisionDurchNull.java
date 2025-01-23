import java.util.InputMismatchException;
import java.util.Scanner;
/*
  Schreibe ein Programm, das zwei Zahlen von der Konsole einliest
  und die Division der beiden Zahlen durchführt.
  Stelle sicher, dass keine Division durch 0 erfolgt.
*/
public class DivisionDurchNull {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Code im try-Block wird auszuführen versucht, sollte es zu einer Exception
        // kommen, stürzt unser Programm nicht ab, sondern der jeweilige catch-Block wird ausgeführt
        try {
            System.out.println("Bitte zwei Zahlen zum Dividieren eingeben.");
            System.out.println("Dividend: ");

            int dividend = sc.nextInt();
            System.out.println("Divisor: ");
            int divisor = sc.nextInt();

            // wir prüfen, ob der Dividend kleiner ist als der Divisor
            // und werfen manuell eine Exception mit dem Schlüsselwort throw
            // (eigentlich kommt es hier zu keiner Exception, wir wollen aber, dass der
            // nachfolgende Code im try Block nicht mehr ausgeführt wird, wenn der Dividend
            // kleiner ist als der Divisor (leicht konstruiertes Beispiel...)
            if (dividend < divisor) {
               throw new IllegalArgumentException("Der Divisor ist kleiner als der Dividend. " +
                       "Das macht doch keinen Sinn, oder?");
            }

            int quotient = dividend / divisor;

            System.out.println("Das Ergebnis der Division von " + dividend + " und " + divisor
                    + " ist: " + quotient);
        // der jeweilige catch-Block wird ausgeführt, wenn es zu einer dieser spezifischen
        // Exception kommt
        // Wir versuchen, jede mögliche Exception individuell abzufangen
        } catch (InputMismatchException i) {
            System.out.println("Als Eingabe sind nur Ganzzahlen erlaubt.");
        } catch (ArithmeticException a) {
            System.out.println("Der Divisor war 0, die Division durch 0 ist nicht erlaubt, " +
                    "bitte einen anderen Divisor eingeben");
        // hiermit reagieren wir auf *jede* Art von Exception, auch die unchecked
        // in der Praxis sollten wir das eher nicht machen, soll hier nur ein Beispiel sein
        } catch (Exception e) {
            System.out.println(e.getMessage());
        // wird *immer* ausgeführt, egal ob es zu einer Exception gekommen ist oder nicht
        } finally {
            System.out.println("Das hier steht im finally Block, der immer ausgeführt wird.");
        }

    }
}
