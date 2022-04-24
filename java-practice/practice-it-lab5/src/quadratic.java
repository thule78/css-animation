public class quadratic {
    public static void quadratic(int a, int b, int c){
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("First root = " + root1);
        System.out.println("Second root = " + root2);
    }
}
