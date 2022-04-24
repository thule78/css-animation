public class mode {
    public static int mode(int[] a){
        //the array has a value between 0 and 100 inclusive
        int [] count = new int[101];
        for(int i = 0; i < a.length; i++){
            // go through each number in an array
            count[a[i]]++;
        }
        // number that we want
        int number = -1;
        // and the count for this number
        int countNum = 0;
        for(int i = 0; i < 101; i++){
            if(count[i] > countNum){
                number = i;
                countNum = count[i];
            }
        }return number;
    }
}
