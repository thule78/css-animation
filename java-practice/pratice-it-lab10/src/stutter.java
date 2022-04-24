import java.util.ArrayList;

public class stutter {
    public static void stutter(ArrayList<String> arr, int k){
        if(k <= 0){
            arr.clear();
        }
        // set length
        int size = arr.size();
        for(int i = 0; i < size; i++){
            String copy = arr.get(i * k);
            // for hw many time that string be copy
            for(int j = 1; j< k; j++){
                arr.add(i * k + j, copy);
            }
        }
    }
}
