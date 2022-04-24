public class processName {
    public static void processName(Scanner sc){
        System.out.print("Please enter your full name: ");
        String name = sc.nextLine();
        String[] parts = name.split(" ");
        System.out.println("Your name in reverse order is " + parts[1] + ", " + parts[0]);
    }
}
