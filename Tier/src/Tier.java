public class Tier {
    String name;
    int alter;
    int anzahlBeine;

    public Tier(String name, int alter, int anzahlBeine) {
        this.name = name;
        this.alter = alter;
        this.anzahlBeine = anzahlBeine;
    }

    void bewegen(){
        System.out.println(this.name + " bewegt sich.");
    }

    void geraeuschMachen(String geraeusch) {
        System.out.println(geraeusch);
    }
}
