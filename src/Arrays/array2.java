
import java.util.Scanner;

public class array2 {

    private static boolean[][] seats = new boolean[5][10]; // 5 rows, 10 seats per row
    private static boolean systemInitialized = false;

    public static void main(String[] args) {
        initializeSeats();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Show available seats");
            System.out.println("2. Book a seat");
            System.out.println("3. Reboot system");
            System.out.println("4. View showtime");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAvailableSeats();
                    break;
                case 2:
                    bookSeat(scanner);
                    break;
                case 3:
                    rebootSystem();
                    break;
                case 4:
                    viewShowtime();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void initializeSeats() {
        System.out.print("#Student card ID:");
        int id= new Scanner(System.in).nextInt();
        System.out.print("#seat no:");
        int seatNo = new Scanner(System.in).nextInt();
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = false; // Initialize all seats as available
            }
        }
        systemInitialized = true;
    }

    private static void showAvailableSeats() {
        System.out.println("Available seats:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {
                    System.out.println("Row " + (i + 1) + ", Seat " + (j + 1) + " is available");
                }
            }
        }
    }

    private static void bookSeat(Scanner scanner) {
        if (!systemInitialized) {
            System.out.println("System not initialized. Please reboot first.");
            return;
        }

        System.out.println("Enter row number:");
        int row = scanner.nextInt();
        System.out.println("Enter seat number:");
        int seat = scanner.nextInt();

        if (row < 1 || row > 5 || seat < 1 || seat > 10) {
            System.out.println("Invalid row or seat number. Please choose again.");
            return;
        }

        if (seats[row - 1][seat - 1]) {
            System.out.println("Seat " + row + ", " + seat + " is already booked. Please choose another seat.");
        } else {
            seats[row - 1][seat - 1] = true;
            System.out.println("Seat " + row + ", " + seat + " booked successfully.");
        }
    }

    private static void rebootSystem() {
        System.out.println("Rebooting system...");
        initializeSeats();
        System.out.println("System rebooted successfully.");
    }

    private static void viewShowtime() {
        // Dummy function for viewing showtime
        System.out.println("Showtime: 7:00 PM");
    }
}