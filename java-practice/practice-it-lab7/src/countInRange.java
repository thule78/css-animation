public class countInRange {
    public static int countInRange(int [] a, int min, int max){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] <= max && a[i] >= min){
                count++;
            }
        }return count;
    }
}
