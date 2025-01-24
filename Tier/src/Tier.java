public class Tier {
    String name;
    int alter;
    int anzahlBeine;

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

    void geraeuschMachen() {
        System.out.println(this.name + " macht ein Geräusch.");
    }
}
