public class range {
    public static int range(int [] a){
        int min = a[0];
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }if(a[i] > max){
                max = a[i];
            }
        }return Math.abs(min - max) + 1;
    }
}
