public class no7 {

    public static void main(String[] args) {
        int[] bilangan = {1, 2, 3, 4, 5, 6, 7};

        
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 != 0) {
                System.out.print(bilangan[i] + "   ");
            }
        }
        System.out.println();

        
        System.out.print("  "); 

        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 == 0) {
                System.out.print(bilangan[i] + "   ");
            }
        }
    }
}
    

