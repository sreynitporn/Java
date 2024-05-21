package Arrays;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("Insert Array length:");
        int arrayLength = new Scanner(System.in).nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insert number [" + i + "]:");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }   System.out.println("Sum of Array element:"+sum);
        float avg=0;
        for (int i = 0; i < numbers.length; i++) {
            avg=sum/numbers.length;
        }System.out.print("avg of array element:" + avg);
    }
}
