public class printPowersOf2 {
    public static void printPowersOf2(int number){
        //variable content multiple
        int multiple = 1;
        for(int i = 0; i <= number; i++){
            System.out.print(multiple + " ");
            multiple *= 2;
        }
    }
}
