public class Main {
    public static void main(String[] args) {
        Tier gretl = new Tier("Gretl", 11, 4);
        System.out.println(gretl.name);
        System.out.println(gretl.alter);
        System.out.println(gretl.anzahlBeine);

        gretl.bewegen();
    }
}
