import java.util.ArrayList;

public class minToFront {
    public static void minToFront(ArrayList<Integer> arr){
        // set min value
        int min = Integer.MAX_VALUE;
        // set index of min value we can remove it inn the array
        int minIndex = 0;
        for(int i = 0; i < arr.size(); i++){
            // looking for the min value
            if(arr.get(i) < min ){
                min = arr.get(i);
                minIndex = i;
            }
        }
        arr.remove(minIndex);
        arr.add(0, min);
    }
}
