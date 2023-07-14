public class Main {
    public static void main(String[] args) {
       System.out.print("Hello Java");// doesnt leave aline
       System.out.println("Hello Java");//leaves a line after printing
       // SOUT+TAB BUTTON IS SHORTCUT IN INTELLI j FOR THIS
       System.out.println("shortcut works");

       //Variables: data stored in java temporarily
       String name = "Ritika";
       String neighbour = "Saniyaa";
       int age = 20;

       String friend = neighbour;
       System.out.println(friend);

       //Types
       //Premitive types store simple values
        //type memory length
        //byte: 1  [-128 to 128]
        //short: 2
        //int: 4 1,2,3
        //long: 8
        //float: 4  decimal
        //double: 8  decimal
        //char: 2  a,c,b
        //boolean: 1 true/flase
        byte newage = 12;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.24F;//mention letters for identification
        char letter = 'a';
        boolean isAdult = false;

       // non primative or referance types store complex value
       String name2 = "BhushanPakhle";
       String name1 = new String("BooBoo");
       // you can perform operation on it
        System.out.println(name2.length());//length is also a non premitive function.
        //primitive have size while nonprimative dont
        //we have to declare it using new keyword
        //Not necessary for String


        //Famous String methods and operations
        //concatinate
        String name3 = name + friend;
        String name4 = name +" and "+ friend;
        System.out.println(name3);
        System.out.println(name4);

        //charAt
        System.out.println(name.charAt(0));

        //length
        System.out.println(name.length());

        //Replace
        System.out.println(name.replace('i', 'b'));
        //String in java are immutable

        //substring
        String mainstring = "Ritika and saniyaa";
        System.out.println(mainstring.substring(0,9));//it will run from 0 to 8
    }
}