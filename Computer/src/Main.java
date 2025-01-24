public class Main {
    public static void main(String[] args) {
        Computer c = new Computer(1234, "Gretl", 9);
        System.out.println(c.getSERIENNUMMER());
        System.out.println(c.getBesitzer());
        System.out.println(c.getSpeicherplatz());

        c.speicherHinzufuegen(-1);
        System.out.println(c.getSpeicherplatz());

        Computer d = new Computer(6789, "Kai", -1);
        System.out.println(d.getSERIENNUMMER());
        System.out.println(d.getBesitzer());
        System.out.println(d.getSpeicherplatz());
    }
}
