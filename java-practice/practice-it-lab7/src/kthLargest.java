public class kthLargest {
    public static int kthLargest(int k, int[] a){
        Arrays.sort(a);
        return a[a.length - (k + 1)];
    }
}
