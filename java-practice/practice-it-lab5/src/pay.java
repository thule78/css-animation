public class pay {
    public static double pay(double rate, int hours){
        double overrate = 1.5 * rate;
        double overhrs =  hours - 8;
        if(hours <= 8) {
            return rate * hours;
        }else {
            return (overrate * overhrs) + (rate * 8);}
    }
}
