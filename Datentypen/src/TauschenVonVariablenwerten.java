public class TauschenVonVariablenwerten {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Der Wert von a ist: " + a + " und der Wert von b ist: " + b);

        // Variable temp als "Zwischenspeicher" anlegen und Wert von a darin speichern
        int temp = a;
        // Wert von b in a speichern
        a = b;
        // Wert von a aus dem Zwischenspeicher temp in b ablegen
        b = temp;

        System.out.println("Der Wert von a ist: " + a + " und der Wert von b ist: " + b);
    }
}
