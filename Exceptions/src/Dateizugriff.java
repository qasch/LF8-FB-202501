import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Dateizugriff {
    /*
    * Schreibe ein Programm, das den Zugriff auf eine Datei simuliert.
    * Das Programm soll prüfen, ob die Datei existiert, und eine entsprechende Meldung ausgeben.
    * Zusätzlich soll sichergestellt werden, dass Ressourcen (wie z. B. Streams) korrekt geschlossen
    * werden
    */
    public static void main(String[] args) {
        // relative Pfadangabe zur Datei
        String dateiPfad = "testdatei.txt";
        // datei Objekt erzeugen, um auf die Datei zugreifen zu können
        File datei = new File(dateiPfad);

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(datei);
        } catch (IOException e){
            System.out.println("Die angegebene Datei existiert nicht.");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException i) {
                    System.out.println("Fehler beim Schliessen des IOStreams.");
           }
        }
    }
}
