package Arrays;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args){
        System.out.print("Insert of Array length:");
        int arrayLength = new Scanner(System.in).nextInt();
        int [] numbers= new int[arrayLength];
        for(int i=0;i<numbers.length;i++){
            System.out.print("Input Element of array  ["+i+"]:");
            numbers[i]= new Scanner(System.in).nextInt();
        }
        int max=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];

            }
        }System.out.println("max number of array:"+max);

    }
}
