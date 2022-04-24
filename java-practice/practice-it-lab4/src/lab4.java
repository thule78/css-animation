public class lab4 {
    /*2.1
    Write code to declare variables for s0 with a value of 12.0, v0 with a value of 3.5,
    a with a value of 9.8, and t with a value of 10, and then write the code to compute
    s on the basis of these values. At the end of your code, print the value of your variable s to the console.
    * double s = 12.0;
    *double v = 3.5;
    *double a = 9.8;
    *int t = 10;
    *double position = s + v*t + 0.5*a*t*t;
    *System.out.println(position);
     */
    /*2.2
    Write a for loop that produces the following output:
    1 4 9 16 25 36 49 64 81 100
    *int a = 1;
    *for(int i = 1; i <= 100; i+=a){
    *a +=2;
    *System.out.print(i + " ");}
     */
    /*2.3
    The Fibonacci numbers are a sequence of integers in which the first two elements are 1,
    and each following element is the sum of the two preceding elements.
    The mathematical definition of each kth Fibonacci number is the following:

    F(k):
    k > 2 : F(k-1) + F(k-2)
    k <= 2 : 1
    *int f0 = 1;
    *int f1 = 1;

    *System.out.print(f0 + " ");
    *System.out.print(f1 + " ");

    *for(int fk = 2; fk <= 144; fk = f0 + f1){
    *System.out.print(fk+ " ");
    *f0 = f1;
    *f1 = fk;
}
    * */
    public  static void starSquare() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
