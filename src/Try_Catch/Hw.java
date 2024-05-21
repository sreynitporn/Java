package Try_Catch;

import java.time.LocalDate;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        System.out.print("Input day : ");
        int day=new Scanner(System.in).nextInt();
        System.out.print("Input month : ");
        int month=new Scanner(System.in).nextInt();
        System.out.print("Input year : ");
        int year=new Scanner(System.in).nextInt();
        try {
            LocalDate date=LocalDate.of(year,month,day);
            System.out.println("LocalDate : "+ date);
        } catch (Exception exception) {
            System.out.println("! Invalid Date ,please input again");

        }
    }
}