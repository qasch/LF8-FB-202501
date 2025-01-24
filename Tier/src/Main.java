public class Main {
    public static void main(String[] args) {
        Hund gretl = new Hund("Gretl", 11, 4);

        System.out.println(gretl.name);
        System.out.println(gretl.alter);
        System.out.println(gretl.anzahlBeine);

        System.out.println(gretl.name + " ist ein " + gretl.art);
        gretl.bewegen();
        gretl.ganzSchoenDollRiechen();
        gretl.mitDemSchwanzWedeln();
        gretl.geraeuschMachen();

        Schildkroete pablo = new Schildkroete("Pablo", 19, 4);

        System.out.println(pablo.name);
        System.out.println(pablo.alter);
        System.out.println(pablo.anzahlBeine);

        System.out.println(pablo.name + " ist ein " + pablo.art);
        pablo.bewegen();
        pablo.macheGarNix();
        pablo.istEinfachSuperToll();
        pablo.geraeuschMachen();

        Hund peppi = new Hund();
        System.out.println(peppi.alter);
    }
}
