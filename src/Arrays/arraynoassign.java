package Arrays;

import java.util.Scanner;
public class arraynoassign {
    public static void main(String[] arg){
        System.out.print("Insert Array length:");
        int arrayLength = new Scanner(System.in).nextInt();
        int [] numbers= new int[arrayLength];
        for(int i=0;i<numbers.length;i++){
            System.out.print("Insert number ["+i+"]:");
            numbers[i]= new Scanner(System.in).nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print("|"+numbers[i]);
        }
    }

}
