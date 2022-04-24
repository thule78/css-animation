public class printGrid {
    public static void printGrid(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            //set variable for number jump in each row
            int temp = i;
            // each row print out to the col before last cols coz last col doesn't have ","
            for(int j = 1; j <= cols - 1; j++){
                System.out.print(temp +", ");
                //in each row the number next to each other = number before + rows
                temp+=rows;

            }
            //last cols
            System.out.print(temp);
            System.out.println();
        }

    }

}
