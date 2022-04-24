public class largestAbsVal2 {
    public static int largestAbsVal(int n, int m, int x){
        // first we compare max abs between n and m,  then use max of n & m compare to abs x
        return Math.max((Math.max(Math.abs(n)), Math.abs(m))), Math.abs(x)
    }
}
