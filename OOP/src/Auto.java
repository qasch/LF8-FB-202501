public class Auto {
    // Eigenschaften - Attribute
    // Deklaration, keine explizite Wertzuweisung nötig, da Klassenvariablen
    // mit ihrem jeweiligen Standardwert initialisiert werden
    // Bzw. wollen wir ja nicht, dass jedes Objekt dieser Klasse mit der gleichen
    // Farbe und Marke gebaut wird.
    public String marke;
    public String farbe;
    public int hoechstgeschwindigkeit;
    public boolean schaltgetriebe;

//    // Standardkonstruktor - nur solange wir keinen eigenen Konstruktor erstellen
//    public Auto() {
//
//    }

    // eigener Konstruktor ohne Parameter
    public Auto(){
       this.marke = "BMW";
       this.farbe = "blau";
       this.hoechstgeschwindigkeit = 250;
       this.schaltgetriebe = false;
    }

    // eigener Konstruktor mit Parametern
    public Auto(String marke, String farbe, int hoechstgeschwindigkeit, boolean schaltgetriebe) {
       this.marke = marke;
       this.farbe = farbe;
       this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
       this.schaltgetriebe = schaltgetriebe;
    }

    // Funktionalitäten - Methoden
    public void starten(){
        System.out.println("Das Auto wurde gestartet");
    }
}

