public class isSorted {
    public static boolean isSorted(double[] array){
        for(int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]) {
                return false;

            }
        }return true;
    }
}
