public class stdev {
    public static double stdev(int[] a){
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        double everage = sum / a.length;
        double x = 0;
        for(int i = 0; i < a.length; i++) {
            x+=(a[i] - everage  ) * ( a[i] - everage );
        }
        return Math.sqrt(x / (a.length - 1));
    }
}
