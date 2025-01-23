public class Main {
    public static void main(String[] args) {
        // Instanz der Klasse Auto erzeugen
        Auto meinAuto = new Auto();
        // Methode starten() der Klasse Auto aufrufen
        meinAuto.starten();
        // Zugriff auf die Attribute
//        meinAuto.farbe = "blau";
//        meinAuto.marke = "BMW";
        System.out.println(meinAuto.farbe);
        System.out.println(meinAuto.marke);
        System.out.println(meinAuto.hoechstgeschwindigkeit);
        System.out.println(meinAuto.schaltgetriebe);

        Auto meinZweitesAuto = new Auto("Nissan Micra", "rot", 142, true);
        meinZweitesAuto.starten();
        System.out.println(meinZweitesAuto.farbe);
        System.out.println(meinZweitesAuto.marke);
        System.out.println(meinZweitesAuto.hoechstgeschwindigkeit);
        System.out.println(meinZweitesAuto.schaltgetriebe);
    }
}
