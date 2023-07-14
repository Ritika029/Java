public class breakAndContinue {
    public static void main(String[] args){
        //break and continue
        int i =0;
        while(true){//infinite loop
            System.out.println(i);
            i++;
            if(i>5){//condition
                break;//break statement will help quit the loop
            }
        }
        //skip 3
        int j =0;
        while(true){//infinite loop
            if(j==3){//checks if 3
                j++;//incremented to 4
                continue;//continues with the loop
            }
            System.out.println(j);
            j++;
            if(j>5){//condition
                break;//break statement will help quit the loop
            }
        }
    }
}
