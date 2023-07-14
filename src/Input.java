import java.util.*;
public class Input {
    public static void main(String[] args){
        //How to take input?
        //use scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Input you age: ");
        float age = sc.nextFloat();
        System.out.println(age);

        //for strings
        System.out.println("Input you name: ");
        String name = sc.next();//next take only single word aka tokens
        System.out.println(name);

        //how to take entire line
//        Scanner ssc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        System.out.println("Input a line: ");
        String line = ssc.nextLine();
        System.out.println(line);

    }
}
