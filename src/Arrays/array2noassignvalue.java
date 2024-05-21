package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array2noassignvalue {
    public static void main(String[] args){
        String[][] names={};
        names=new String[4][];
        names[0]= new String[3];
        names[1]= new String[2];

        System.out.println(Arrays.deepToString(names));
    }
}
