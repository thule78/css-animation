public class percentEven {
    public static double percentEven(int[] a){
        double num = 0;
        if(a.length < 1){
            return 0.0;
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                num++;
            }
        }return (num * 100)/a.length;
    }
}
