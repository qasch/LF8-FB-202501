public class Verzweigung {
    /*
    Schreibe ein Programm, das zwei Zahlen a und b
    vergleicht und die größere Zahl ausgibt.
    */
    public static void main(String[] args) {
        int a = 11;   // hart codiert -> im Code festgelegt
        int b = 11;

        if(a > b) {  // true
            System.out.println("a (" + a + ") ist grösser als b (" + b + ").");
        } else if (a < b) {   // wird gar nicht mehr geprüft, da obiges if schon true
            System.out.println("b (" + b + ") ist grösser als a (" + a + ").");
        } else {
            System.out.println("a (" + a + ") ist gleich b (" + b + ").");
        }
    }
}
