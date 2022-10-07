import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercise 1 — Run of Integers
        // Write a program that asks the user for a starting value and an ending 
        // value and then writes all the integers (inclusive) between those two values.
        // Input the start:
        // > 3
        // Input the End:
        // > 9
        // Expected Output :
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        // 9

        Scanner scan = new Scanner(System.in);
        int startNum;
        int endNum;
        System.out.print("Please Enter Starting Integer: ");
        startNum = scan.nextInt();
        System.out.print("Please Enter Ending Integer: ");
        endNum = scan.nextInt();
        for (int i = startNum; startNum < endNum; startNum++){
            System.out.println("Starting Integer: " + i + " Integer Between: "+ startNum + " Ending Integer: " + endNum);
        }
        scan.close();
    }
}
