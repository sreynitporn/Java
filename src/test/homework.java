import java.util.Scanner;

public class homework {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Number greatest and lowest :");

        System.out.println("Input FirstNumber:");
        int firstNumber= scanner.nextInt();

        System.out.println("Input SecondNumber:");
        int secondNumber = scanner.nextInt();

        System.out.println("Input thirdNumber:");
        int thirdNumber = scanner.nextInt();
        int greatest = firstNumber;
        int lowest = firstNumber;

        if (secondNumber > greatest) {
            greatest = secondNumber;
        }

        if (thirdNumber > greatest) {
            greatest = thirdNumber;
        }

        if (secondNumber < lowest) {
            lowest = secondNumber;
        }

        if (thirdNumber < lowest) {
            lowest = thirdNumber;
        }
        System.out.println("The Greatest: " + greatest);
        System.out.println("The Lowest: " + lowest);
        

    }
}
