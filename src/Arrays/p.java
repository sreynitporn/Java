package Arrays;

import java.util.Scanner;

public class p {
    public static void  main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter row:");
        int row= scanner.nextInt();
        System.out.println("Enter column:");
        int column= scanner.nextInt();
        String[][] array2D = new String[row][column];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter the values for row [" + (i + 1) + "]:");
            for (int j = 0; j < column; j++) {
                System.out.print("Enter value for column [" + (j + 1) + "]: ");
                array2D[i][j] = scanner.next();
            }
        }
        System.out.println("\nPrint all values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A-"+array2D[i][j] +"|");
            }
                System.out.println();
        }
    }
}
