public class printSquare {
    public static void printSquare(int min, int max){
        // loop for line from min to max
        for(int i = min; i <= max; i++){
            //loop each row start from min to max number
            for(int j = i; j <= max; j++){
                System.out.print(j);

            }
            //loop each row step back min number
            for(int k = 0; k < i - min; k++){
                System.out.print(min + k);
            }
            //print enter line
            System.out.println();
        }

    }
}
