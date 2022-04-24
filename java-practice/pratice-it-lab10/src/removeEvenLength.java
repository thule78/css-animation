import java.util.ArrayList;

public class removeEvenLength {
    public static void removeEvenLength(ArrayList<String> a){
        // we delete from the back if delete from the front the index will jump and it messi around
        for(int i = a.size() - 1; i >= 0; i--){
            if(a.get(i).length() % 2 == 0 ){
                a.remove(i);
            }
        }
    }
}
