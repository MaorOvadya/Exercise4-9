import java.util.* ;
public class Exercise2 {
    
        public static void main(String [] args){
            // Exercise 2 — Sum of sequential integers
        // Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
        // Input the N:
        // > 10
        // Expected Output :
        // The sum of 1 to 10 is 55

        Scanner scan = new Scanner(System.in);
            int num = 1;
            int n = 0;
            int sum = 0;
            System.out.print("Please enter between 1 to N: ");
            n = scan.nextInt();
            for(int i = num;i <= n; i++ ){
                sum += i;
            }
            System.out.print("the Sum is: " + num + " to " + n + " is: " +sum);
            scan.close();
        }
    
}