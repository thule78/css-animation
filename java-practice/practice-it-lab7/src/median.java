import java.lang.reflect.Array;

public class median {
    public static int median(int[] a){
        Arrays.sort(a);
        return a[a.length/2];

    }
}
