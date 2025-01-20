public class FehlerhafteKonvertierung {
    /*
     Schreibe ein Programm, das versucht, eine String-Variable
     in einen int zu konvertieren, und beobachte den Fehler.
     */

    public static void main(String[] args) {
//        String myString = "Hallo";
//        int myInt = (int) myString;
        // -> java: incompatible types: java.lang.String cannot be converted to int

        // Aber Casting von einem Char in ein Int oder Float funktioniert (ASCII-Tabelle)
        char myChar = 'l';
        int myInt = (char) myChar;
        float myFloat = (char) myChar;
        System.out.println("myChar: " + myChar);
        System.out.println("myInt: " + myInt);
        System.out.println("myFloat: " + myFloat);
    }
}
