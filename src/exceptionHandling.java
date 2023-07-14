public class exceptionHandling {
    public static void main(String[] args){
        //try and catch
        int[] marks ={99, 98, 97};
        try{
            System.out.println(marks[5]);
        } catch (Exception data){//Exception: keyword; data: variable
            //do things after catching exception
            System.out.println(data);//printing exception
        }
        System.out.println("HEHEHE HOHOHO");
    }
}
