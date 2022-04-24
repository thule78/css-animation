public class spacesAndNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            //empty spacing
            for(int j = 4; j >= i; j--){
                System.out.print(" ");
            }
            //number
            for(int z = 0; z < i; z++){
                System.out.print(i);
            }
            //line
            System.out.println();
        }
    }
}
