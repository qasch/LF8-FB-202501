public class Summieren {
    /*
      Schreibe ein Programm, das die Summe der Zahlen von 1 bis 100 berechnet.
    */
    public static void main(String[] args) {
        int summe = 0;
        int grenze = 100;

        for(int i=1; i<=grenze; i++){
            summe += i;
        }

        System.out.println(summe);
    }
}
