public class distance {
    public static  double distance(int x1, int y1, int x2, int y2){
        double d = (x2-x1) * (x2-x1) + (y2-y1)*(y2-y1);
        return(Math.sqrt(d));

    }
}
