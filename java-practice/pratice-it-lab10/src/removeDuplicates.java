import java.util.ArrayList;

public class removeDuplicates {
    public static void removeDuplicates(ArrayList<String> a){
        for(int i =  0; i < a.size() - 1; i++){
            if(a.get(i+1).equals(a.get(i))){
                a.remove(i+1);
                i--;
            }
        }
    }
}
