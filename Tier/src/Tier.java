public abstract class Tier {
    // eine abstrakte Klasse ist eine Vorlage/Bauplan für weitere erbende Klassen
    // aus einer abstrakten Klasse können keine Instanzen erzeugt werden
    String name;
    int alter;
    int anzahlBeine;
    String art;

    public Tier() {
        this.alter = 1;
    }

    public Tier(String name, int alter, int anzahlBeine) {
        this.name = name;
        this.alter = alter;
        this.anzahlBeine = anzahlBeine;
    }

    void bewegen(){
        System.out.println(this.name + " bewegt sich.");
    }

    // abstrakte Methode:
    // enthält keinen Methodenrumpf/Funktionalität
    // *muss* in erbenden Klassen überschrieben werden
    abstract void geraeuschMachen();
}
