import java.util.ArrayList;

public class doubleList {
    public static void doubleList(ArrayList<String> a){
        int aSize = a.size();
        for(int i = 0; i < aSize; i ++){
            String doublicate = a.get(2*i);
            a.add(2*i+1, doublicate);
        }
    }
}
