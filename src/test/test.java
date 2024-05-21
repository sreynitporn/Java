import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your choice :");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Hello");
                break;
                case 2:
                    System.out.println("World");
                    break;
            default:
                System.out.println("please choose again!!");

        }
    }
}
