import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        // arithmetic assignment logical comparison
        //arithmetic
        int a=6;
        int b=2;
        int sum=a+b;
        System.out.println(sum);
        int diff=a-b;
        System.out.println(diff);
        int mul=a*b;
        System.out.println(mul);
        int div=a/b;
        System.out.println(div);
        int mod=a%b;
        System.out.println(mod);

//        assignment
        int c=5;
        c = c+1;
        //but instead we use unary operator
//        c++: value saved first then incremented;
        System.out.println(c++);//printed: 6, changed to: 7
//        ++c: value incremented first then saved;
        System.out.println(++c);//changed to 8, printed 8
        //similarly, we use -- also
        System.out.println(c--);//printed: 8, changed to: 7
//        ++c: value incremented first then saved;
        System.out.println(--c);//changed to 6, printed 6

        //comparison
        //== !== > < <= >=
        //returns true or false
        //conditional statements
        boolean isSunUp = false;
        if (isSunUp==true)
            System.out.println("day");
        else
            System.out.println("night");

        //with comparison
        int age = 20;
        if (age>18)
            System.out.println("can vote");
        else
            System.out.println("cant vote");

        //logical operators
        //&& logical and
        //|| logical or
        //! not operator
        int z = 60;
        int x = 40;
        if (z>50 && x<50)
            System.out.println("x less than 50");
        if (z<50 || x<50)
            System.out.println("anyone less than 50");

        boolean isAdult = false;
        if (isAdult)//checks with ==true as default
            System.out.println("adult");
        if (!isAdult)//negation operator
            System.out.println("not adult");

        //summation code for these operators:
        Scanner sc = new Scanner(System.in);//system.in for general input
        // pen =10, notebook=40
        int cash = sc.nextInt();
        if (cash<10) {//{ is used for more than one statement under if
            System.out.println("Cant buy nothing");
            System.out.println("get more cash");
        }
        else if (cash>10 && cash<50){
            System.out.println("Can buy pen");
            System.out.println("get more cash for notebook");
        }
        else{
            System.out.println("Can buy both");
        }
    }
}
