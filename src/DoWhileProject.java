import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number =0;
        do{
            System.out.println("Input a number: ");
            number = sc.nextInt();
            System.out.print("Here is you number: ");
            System.out.println(number);
        }while (number>=0);//this will print the negative number then end the loop
        System.out.println("THE END");
    }
}
