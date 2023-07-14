import java.util.*;

public class Coding {
    public static void main(String[] args) {
        //tyoe[] name = new type[len]
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 99;

        System.out.println(marks);//doesnt actual print makes
        System.out.println(marks[0]);
        //if you dont intialize in java, it take null/0/false values wrt data type

        //length
        System.out.println(marks.length);//dont need () with len for arrays

        //sort and arrays class
        System.out.println(marks[0]);
        Arrays.sort(marks);//gotta inclued a pakage for this
        System.out.println(marks[0]);

        //perviously known values
        int[] markz = {95, 96, 97, 98};

        //2D arrays
        int[][] finalMarks ={{98, 99, 95}, {93, 92, 97}};
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[1][1]);
        System.out.println(finalMarks[0][2]);
    }
}
