import java.util.ArrayList;

public class filterRange {
    public static void filterRange(ArrayList<Integer> arr, int min, int max){
        for(int i = 0; i < arr.size(); i++){
            int num = arr.get(i);
            if(num <= max && num >= min){
                arr.remove(i);
                i--;
            }
        }

    }
}
