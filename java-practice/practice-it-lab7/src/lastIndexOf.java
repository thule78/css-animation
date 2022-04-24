public class lastIndexOf {
    public static int lastIndexOf(int[] array, int target){
        // check the array from the last to the first
        for(int i = array.length - 1; i >= 0; i--){
            // unitl it meet target
            if(array[i] == target){
                return i;
            }
        }// if target can't found
        return -1;
    }
}
