public class Hund extends Tier {

    // eigener parameterloser Konstruktor
    public Hund() {
        // obwohl wir hier kein super() verwenden, wird der
        // parameterlose Konstruktor von Tier aufgerufen
    }

    public Hund(String name, int alter, int anzahlBeine) {
        super(name, alter, anzahlBeine);
    }

    @Override
    void geraeuschMachen(){
        System.out.println("Wuff Wuff");
    }

    void mitDemSchwanzWedeln() {
        System.out.println("WedelWedelWedel");
    }

    void ganzSchoenDollRiechen() {
        System.out.println("Puuuuuh");
    }
}
