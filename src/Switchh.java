public class Switchh {
    public static void main(String[] args){
        //conditional statements
        //switch
        int day =2;

        switch(day){
            case 1://if you match with one case, the later will be printed automatically if you dont use break
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("wed-sun");

        }
    }
}
