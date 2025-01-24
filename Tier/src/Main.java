public class Main {
    public static void main(String[] args) {
        Hund gretl = new Hund("Gretl", 11, 4);

        System.out.println(gretl.name);
        System.out.println(gretl.alter);
        System.out.println(gretl.anzahlBeine);

        gretl.bewegen();
        gretl.ganzSchoenDollRiechen();
        gretl.mitDemSchwanzWedeln();
        gretl.geraeuschMachen();

        Schildkroete pablo = new Schildkroete("Pablo", 19, 4);

        System.out.println(pablo.name);
        System.out.println(pablo.alter);
        System.out.println(pablo.anzahlBeine);

        pablo.bewegen();
        pablo.macheGarNix();
        pablo.istEinfachSuperToll();
        pablo.geraeuschMachen();

        Hund peppi = new Hund();
        System.out.println(peppi.alter);
    }
}
