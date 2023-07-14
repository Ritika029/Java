public class Casting {
    public static void main(String[] args){
        //casting
        //smaller type int is stored in bigger type double this is called
        //implicit casting
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        int p = 100;
        //double in int not allowed since int has smaller size than int
        //int fp = p + 18.0; -  doest work due to casting
        // to make this work we use explicit casting
        int ffp = p + (int)18.18;
        System.out.println(ffp);

        //constants
        // to never change it
        // for this we use final keyword and make it immutable
        //and all coders define constants in all CAPS
        final float PI = 3.14F;
    }
}
