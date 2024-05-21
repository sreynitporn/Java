import java.util.Scanner;

public class lables {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Math score: ");
            int math = scanner.nextInt();

            System.out.print("Enter Khmer score: ");
            int khmer = scanner.nextInt();

            System.out.print("Enter English score: ");
            int english = scanner.nextInt();

            System.out.print("Enter History score: ");
            int history = scanner.nextInt();

            double total = math + khmer + english + history;
            double avg = total / 4;

            if (avg >= 100) {
                System.out.println("A");
            } else if (avg <= 80 && avg > 90) {
                System.out.println("B");
            } else if (avg <= 70 && avg > 80) {
                System.out.println("C");
            } else if (avg <= 60 && avg > 70) {
                System.out.println("D");
            } else if (avg <= 50 && avg > 60) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
            System.out.println("Total score = " +total);
            System.out.println(" avg = " + avg);
        }

}
