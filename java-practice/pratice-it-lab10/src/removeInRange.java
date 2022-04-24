import java.util.ArrayList;

public class removeInRange {
    public static void removeInRange(ArrayList<Integer> arr, int value, int startIndex, int endIndex){
        for(int i = startIndex; i < endIndex; i++){
            if(arr.get(i) == value){
                arr.remove(i);
                i--;
                endIndex--;
            }
        }
    }
}
