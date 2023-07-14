public class functionAndMethods {
    public static void main(String[] args){
        printJava();//function
        printJava();
        printJava();
        printName("Ritika");
        printName("Saniyaa");
        printSum(11, 9);
    }
    public static void printJava(){//might as well take input in(); void cause no output
        System.out.println("Hello Java");
    }

    public static void printName(String name){//input name
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
