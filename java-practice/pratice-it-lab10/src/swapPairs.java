import java.util.ArrayList;

public class swapPairs {
    public static void swapPairs(ArrayList<String> a){
        // loop start with second element, 2 steps for each loop
        for(int i = 0; i < a.size() -1; i += 2){
            // set first word &&second word to be swap
            String word1 = a.get(i);
            String word2 = a.get(i+1);
            // relace
            a.set(i, word2);
            a.set(i+1, word1);
        }
    }
}
