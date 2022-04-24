public class numbersOutput60 {
    public static void main(String[] args){
        for(int i = 1; i <= 6; i++){
            // set of space
            for(int s = 1; s <= 9; s++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int j = 1; j <= 6; j++){
            //set of number from 1...9
            for(int x = 1; x <= 9; x++){
                System.out.print(x);
            }
            //add "0" in to number set
            System.out.print("0");
        }
    }
}
