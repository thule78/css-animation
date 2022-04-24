import java.util.Scanner;

public class inputBirthday {
    public static void inputBirthday(Scanner sc){
        System.out.print("On what day of the month were you born? ");
        int day = sc.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = sc.next();
        System.out.print("During what year were you born? ");
        int year = sc.nextInt();
        System.out.print("You were born on " + month + " " + day+"," + " " + year + ". You're mighty old!");
    }
}
