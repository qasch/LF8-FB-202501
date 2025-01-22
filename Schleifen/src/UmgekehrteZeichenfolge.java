public class UmgekehrteZeichenfolge {
    /*
      Schreibe ein Programm, das eine Zeichenfolge vom Benutzer
      einliest und diese umgedreht ausgibt.
    */
    public static void main(String[] args) {
        String eingabe = "Ja wie cool ist das denn!";
        String ausgabe = "";

        int eingabeLaenge = eingabe.length();
        int letztePosition = eingabeLaenge - 1;

        for(int i=letztePosition; i>=0; i--){
           ausgabe += eingabe.charAt(i);
        }
        System.out.println(eingabe);
        System.out.println(ausgabe);
    }
}
