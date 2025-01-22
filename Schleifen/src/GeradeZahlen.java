public class GeradeZahlen {
    /* Gib alle geraden Zahlen zwischen 1 und 50 aus */
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            // Modulo
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
