public class Benutzerinforamtion {
    public static void main(String[] args) {
        String name = "Gretl";
        int alter = 11;
        double groesse = 0.3;
        boolean schueler = false;

        System.out.println(name);
        System.out.println(alter);
        System.out.println(groesse);
        System.out.println(schueler);

        System.out.println("Der Name ist:" + name);  // + Konkatenationsoperator
        // Umwandlung der Datentypen in einen String durch implizites Casting
        System.out.println("Der Name ist " + name + ", das Alter ist " + alter +
                ", die Groesse ist " + groesse + " und ist sie Schüler? " + schueler);

    }
}
