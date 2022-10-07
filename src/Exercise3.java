import java.util.Scanner;
public class Exercise3 {
    
    public static void main(String [] args) {
        //Exercise 3 - Word Echo
        // Write a program that asks the user to enter a word. The program will then 
        // repeat the word for as many times as its characters: Sample Output:
        // Enter a word:
        // > Hello
        // Expected Output :
        // Hello
        // Hello
        // Hello
        // Hello
        // Hello
    
         Scanner scan = new Scanner(System.in);
         String str;
         System.out.print("Please enter word:");
         str = scan.next();
         int len = str.length();
            for(int i = 0; i<len; i++){
                System.out.println(str);
            }
                scan.close();
    }
  
}
