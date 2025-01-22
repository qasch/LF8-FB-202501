import java.util.Arrays;

public class GrundlagenArray {
    public static void main(String[] args) {
        // Array, welches 5 Integer Werte aufnehmen kann
        int[] ganzZahlen;  // Deklaration
        ganzZahlen = new int[5]; // Initialisierung: Platz für 5 Integer Werte (sind hier jetzt alle 0)
        // Wertzuweisung
        ganzZahlen[0] = 2;
        ganzZahlen[1] = 5;
        ganzZahlen[2] = 3;
        ganzZahlen[3] = 4234;
        ganzZahlen[4] = 0;

        // Deklaration, Initialisierung und Wertzuweisung in einem Schritt
        int[] ganzZahlen2 = {2, 5, 3, 4234, 0};

        System.out.println(ganzZahlen[2]);
        System.out.println(ganzZahlen2[2]);

        String[] stringArray = {"Hallo", "du", "da"};

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
//        System.out.println(stringArray[3]);

        // Hallo, du, da
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        System.out.println(stringArray);  // -> [Ljava.lang.String;@4f3f5b24

        // wir können die Länge eines Arrays nicht ändern!
        // aber die einzelnen Werte

        stringArray[0] = "Huhu";
        System.out.println(stringArray);  // -> [Ljava.lang.String;@4f3f5b24

        // Huhu, du, da
        // for each -> (java:) enhanced for loop
        for(String element : stringArray){
            System.out.println(element);
        }

        String[] myOtherStringArray = {"bli", "bla", "blupp"};

        System.out.println(Arrays.toString(myOtherStringArray));


        // Mehrdimensionales Array
        // 1 2 3
        // 4 5 6
        // 7 8 9

        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.println(matrix[1][0]);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int zeilen = 3;
        int spalten = 3;
        int[][] otherMatrix = new int[zeilen][spalten];

    }
}












