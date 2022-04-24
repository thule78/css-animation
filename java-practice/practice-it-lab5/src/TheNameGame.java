import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String first = sc.next();
        String last = sc.next();

        method(first);
        System.out.println();
        method(last);
    }
    public static void method(String name){

        System.out.println(name + " " + name + ", bo-" +
                name.replace(name.substring(0), "B")+name.substring(1));
        System.out.println("Banana-fana fo-" + name.replace(name.substring(0), "F")+name.substring(1));
        System.out.println("Fee-fi-mo-" + name.replace(name.substring(0), "M")+name.substring(1));
        System.out.println(name.toUpperCase()+"!");
    }

}