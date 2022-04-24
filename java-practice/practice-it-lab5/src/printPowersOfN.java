public class printPowersOfN {
    public static void printPowersOfN(int base, int exponent){
        int m = 1;
        for(int i = 0; i <= exponent; i++){
            System.out.print(m + " ");
            m *= base;
        }
    }
}
