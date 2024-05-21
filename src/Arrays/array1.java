package Arrays;

import java.util.Scanner;
//assign value
public class array1 {
    public static void main(String[] arg){
        int [] numbers= new int[4];
        for(int i=0;i<numbers.length;i++){
            System.out.print("Insert number ["+i+"]:");
            numbers[i]= new Scanner(System.in).nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print("|"+numbers[i]);

        }
    }
}
