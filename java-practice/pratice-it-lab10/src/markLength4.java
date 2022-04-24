import java.util.ArrayList;

public class markLength4 {
    public static void markLength4(ArrayList<String> arr){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() == 4){
                arr.add(i, "****");
                i++;
            }
        }
    }
}
