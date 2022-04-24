public class padString {
    public static String padString(String str, int length){
        if(length == str.length()){
            return str;
        } else {
            String space = "";
            int l = length - str.length();
            for( int i = 0; i <= l - 1; i++){
                space +=" ";
            }
            return space + str;
        }
    }
}
