import java.util.ArrayList;

public class removeShorterStrings {
    public static void removeShorterStrings(ArrayList<String> arr){
        int size = arr.size();
        int minIndex = 0;
        for(int i =  0; i < size/2; i++){
            int word1 = arr.get(i).length();
            int word2 = arr.get(i+1).length();
            if(word1 == word2){
                arr.remove(i);
            }
            if(word1 < word2){
                arr.remove(i);
            }
            if(word2 < word1) {
                arr.remove(i+1);
            }
        }
    }
}
