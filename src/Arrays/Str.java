package Arrays;

import java.util.Scanner;

public class Str {
    public  static void main(String[] args){
        /*
        char start = 'A';
        char end = 'Z';

        String[][] array2D = new String[start][end];
        for(int i=0;i<start;i++){
            System.out.println("Enter row ["+i+"]:");
            for (char c = start; c <= end; c++) {
                System.out.print("Enter SeatNo"+c+ " ");

            }
         */
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

