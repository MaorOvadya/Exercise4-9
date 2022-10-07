import java.util.Scanner;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String []args){
      // Exercise 4 - Adding up Integers
    // Write a program that adds up integers that the user enters. First the programs asks
    //  how many numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum. Sample output:
    // How many integers will be added?
    // 5
    // Enter an integer:
    // 3
    // Enter an integer:
    // 4
    // Enter an integer:
    // -4
    // Enter an integer:
    // -3
    // Enter an integer:
    // 7
    // Expected Output :
    // The sum is 7
    Scanner scan = new Scanner(System.in);
    int count;
    int sum = 0;
    int num;
    System.out.print("please enter amount Integers: ");
    count = scan.nextInt();
    for (int i = 0; i < count ;i++){
        System.out.print("please enter Integer: ");
        num = scan.nextInt();
        sum += num;

    }
    System.out.print("Sum of Integers: "+sum);

    scan.close();
    }
}
