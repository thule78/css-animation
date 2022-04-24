public class minGap {
    public static int minGap(int[] a){
        int gap = 101;
        if(a.length <= 1){
            return 0;
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] - a[i - 1] < gap) {
                gap = a[i] - a[i - 1];
            }
        }return gap;
    }
}
