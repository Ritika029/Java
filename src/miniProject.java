import java.util.*;

public class miniProject {
    public static void main(String[] args){
//        Let’s create a project where we are trying to ask the user to guess a randomly generated number.
//        The number is in the range of 1 to 100.
//
//        If the user guesses a number that is greater, we print “The number is too large”.
//        If the user guesses a number that is smaller, we print “The number is too small”.
//        If the user is able to correctly guess the number, then we print “Correct Number!”.
//
//        At the end we will print the number that was generated by our Math library.
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
         do{
             System.out.println("Guess my number(1 to 100): ");
             userNumber = sc.nextInt();
             if(userNumber==myNumber){
                 System.out.println("correct number");
                 break;
             }
             else if(userNumber>myNumber){
                 System.out.println("large number");
             }
             else{
                 System.out.println("small number");
             }
         }while(userNumber >=0);
        System.out.print("My number was: ");
        System.out.println(myNumber);
    }
}
