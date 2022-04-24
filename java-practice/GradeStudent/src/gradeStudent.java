import java.util.ArrayList;
import java.util.Scanner;

public class gradeStudent {
    /*
    - Main method content method begin, method midTerm, method finalTerm, method homeWork, and method report
    + method begin to print out greeting “This program reads exam/homework scores
        and reports your overall course grade”
    + method midTerm/finalTerm, let user put in midterm/finalTerm score including:
        1/ Weight is an integer from (0-100)
        2/ Score earned
        3/ Were scores shifted (1 = yes, 2 = no?)/ which is the "yes" is Weigh allow to increasing, otherwise is "no"
        if "yes"
        3.1/ Shift amount
        4/ return Total points = (Score earned + shift amount) (must <= 100)
        5/ Return Weighted score = (Total points / 100) * Weight, return Weight score / Weight
     + method homework
        1/ Weight is an integer from (0-100)
        2/ Number of assignments? integer
        3/ put in each assigment's score and max
        4/ How many sections user attend?
        5/ section points = 5*section attend
        6/ total points = total assigments + section points.
            Max of assigment points = total max of assigmnet + 30
        7/ weighted score = (total points /total max points )*45
        ** Grade = Weighted midTerm Score + Weighted finalTerm Score + Weighted Homework Score
      + method report
        round Grade
        Grade >= 85 => GPA=3.0;
        75 =< gade < 85 => GPA = 2.0;
        60 =< grade < 75 => GPA = 1.0;
        grade < 60 => GPA = 0.0
     */
    // set static overAll in the class to call it inside main methods & report method
    static double overAll = 0;
    public static void main(String[] args) {
        System.out.println(gradeStudent.begin());
        System.out.println();
        //midterm results print out
        double[] m = midTerm();
        System.out.println("Total points = " + (int) Math.round(m[0]) + " / 100");
        // Math.round(x*10)/10.0 round double to 1 decimal, (int) Math.round(y) cover double y to int
        System.out.println("Weight score = " + Math.round(m[1]*10)/10.0+ " / " +(int) Math.round(m[2]) );
        System.out.println();
        //finalterm results print out
        double[] f = finalTerm();
        System.out.println("Total points = " + (int) Math.round(f[0]) + " / 100");
        System.out.println("Weight score = " + Math.round(f[1]*10)/10.0 +" / " + (int) Math.round(f[2]));
        System.out.println();
        //homework result print out
        double[] h =homeWork();
        System.out.println("Section points = " + (int) Math.round(h[0]) + " / 30");
        System.out.println("Total points = " + (int) Math.round(h[1]) + " / " + (int) Math.round(h[2]));
        System.out.println("Weighted score = " + Math.round(h[3]*10)/10.0 + " / " + (int) Math.round(h[4]));
        //print overall
        System.out.println();
        // Math round for 1 decimal
        overAll = Math.round((h[3] + f[1] + m[1])*10)/10.0;
        System.out.println("Overall percentage = " + overAll);
        //grade print out
        System.out.println("Your grade will be at least: " + gradeStudent.report());
        // print out end
        System.out.println("Have a nice day!!");
    }
    public static String begin(){
       String greeting = "This program reads exam/homework scores\n" + "and reports your overall course grade";
        return greeting;
        }
    public  static double[] midTerm(){
        Scanner sc = new Scanner(System.in);
        double midTotal = 0;
        double midWeigted = 0;
        System.out.println("Mid Term:");
        System.out.print("Weight is an integer from (0-100)? ");
        int midWeight = sc.nextInt();
        System.out.print("Score earned? ");
        int midScoreEarned = sc.nextInt();
        System.out.print("Were scores shifted (1 = yes, 2 = no?) ");
        int midShift = sc.nextInt();
        if(midShift == 1){
            System.out.print("Shift amount? ");
            int midShiftAmount = sc.nextInt();
            midTotal = midScoreEarned + midShiftAmount;
            if(midTotal >= 100){
               midTotal = 100;
            }else {
                midTotal = midTotal;
            }
        }
        if(midShift == 2){
            midTotal = midScoreEarned ;
            if(midTotal >= 100){
                midTotal = 100;
            }else {
               midTotal = midTotal;
            }
        }midWeigted = (midTotal/100)*midWeight;
        // create an array to stored 2 values
        double[] midResults = {midTotal, midWeigted, midWeight};
        return midResults;
    }
    public  static double[] finalTerm(){
        Scanner console = new Scanner(System.in);
        double finalTotal = 0;
        double finalWeigted = 0;
        System.out.println("Final Term:");
        System.out.print("Weight is an integer from (0-100)? ");
        int finalWeight = console.nextInt();
        System.out.print("Score earned? ");
        int finalScoreEarned = console.nextInt();
        System.out.print("Were scores shifted (1 = yes, 2 = no?) ");
        int finalShift = console.nextInt();
        if(finalShift == 1){
            System.out.print("Shift amount? ");
            int finalShiftAmount = console.nextInt();
            finalTotal = finalScoreEarned + finalShiftAmount;
            if(finalTotal >= 100){
                finalTotal = 100;
            }else {
                finalTotal = finalTotal;
            }
        }
        if(finalShift == 2){
            finalTotal = finalScoreEarned;
            if(finalTotal >= 100){
                finalTotal = 100;
            }else {
                finalTotal = finalTotal;
            }
        }finalWeigted = (finalTotal/100)*finalWeight;
        // create an array to stored 2 values
        double[] finalResults = {finalTotal, finalWeigted, finalWeight};
        return finalResults;
    }
    public static double[] homeWork(){
        System.out.println("Homework:");
        double sectionPoints = 0;
        double homeWeighted = 0;
        double homeTotal = 0;
        double homeMaxTotal = 0;
        Scanner srn = new Scanner(System.in);
        System.out.print("Weight (0 - 100) ? ");
        int homeWeight = srn.nextInt();
        System.out.print("Number of assigments? ");
        int homeAssigs = srn.nextInt();
        int assigsTotal = 0;
        int assigsMaxTotal = 0;
        for(int i = 1; i <= homeAssigs; i++){
            System.out.print("Assigment " + i +" score and max? " );
            int assignScrore = srn.nextInt();
            int assignsMax = srn.nextInt();
            assigsTotal += assignScrore;
            assigsMaxTotal += assignsMax;
            if(assigsTotal <= 150){
                assigsTotal =assigsTotal;
            }else {
                assigsTotal = 150;
            }
        }
        System.out.print("How many sections did you attend? ");
        int sectionAttend = srn.nextInt();
        sectionPoints = sectionAttend * 5;
        if(sectionPoints <= 30){
            sectionPoints = sectionPoints;
        }else {
            sectionPoints = 30;
        }
        homeTotal = assigsTotal + sectionPoints;
        homeMaxTotal = assigsMaxTotal + 30;
        homeWeighted = (homeTotal/homeMaxTotal)*homeWeight;
        double[] homeResult = {sectionPoints, homeTotal, homeMaxTotal, homeWeighted, homeWeight};
        return homeResult;
    }
    public static double report(){
        double grade = 0;
        if(overAll >= 85.0){
           grade = 3.0;
        }else if(overAll <= 85.0 && overAll >= 75.0){
            grade = 2.0;
        } else if(overAll <= 75.0 && overAll >= 60.0) {
            grade = 1.0;
        }else {
            grade = 0.0;
        }
        return  grade ;
    }


}
