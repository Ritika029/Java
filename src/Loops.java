public class Loops {
    public static void main(String[] args){
        //Loops
        //for loops
        //print 1 to 100 numbeers
        for(int i=1; i<=100; i++){
            System.out.println(i);
            //prints from 1 to 100
        }
        //print 100 to 1 numbeers
        for(int i=100; i>=1; i--){//whatever you declare in for loop stays in for loop
            System.out.println(i);
            //prints from 1 to 100
        }

        //while loop
        int i =100;
        while (i>=1){
            System.out.println(i);
            i--;
        }

        //do while loop
        int k = 100;
        do{
            System.out.println(k);
            k--;
        }while (k>=1);
    }
}
