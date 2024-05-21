import java.util.Scanner;

public class Hall {

    public static void main(String[] args) {
        hallBooking();
    }

    public static void hallBooking() {
        System.out.println("==========================Information Hall Booking==========================");

        System.out.println("==========================================");

        char letter = 'A';
        String available = "AV";
        String booked = "BO";

        System.out.println("..................Hall Seat.......");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to book seats? (y/n)");
        char bookingChoice = scanner.next().charAt(0);

        if (bookingChoice == 'y' || bookingChoice == 'Y') {
            System.out.println("Enter the number of seats you want to book:");
            int seatsNo = scanner.nextInt();

            System.out.print("#Student card ID:");
            int id = scanner.nextInt();

            System.out.print("Enter row:");
            int row = scanner.nextInt();

            System.out.print("Enter column:");
            int col = scanner.nextInt();

            String[][] seats = new String[row][col];

            // Initialize seats with availability status
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    seats[i][j] = "|" + letter + "-" + (j + 1) + "|" + ":" + available;
                }
                letter++;
            }

            // Handle seat booking
            if (seatsNo > 0) {
                int bookedSeats = 0;
                while (bookedSeats < seatsNo) {
                    System.out.println("Enter the row and column of the seat to book (e.g., B-2):");
                    String seatSelection = scanner.next();

                    int selectedRow = -1;
                    int selectedCol = -1;

                    // Validate seat selection format (e.g., B-2)
                    if (seatSelection.matches("[A-Z][-]\\d+")) {
                        selectedRow = seatSelection.charAt(0) - 'A'; // Convert row letter to index
                        selectedCol = Integer.parseInt(seatSelection.substring(2)) - 1; // Extract and convert column number
                    }

                    if (selectedRow >= 0 && selectedRow < row && selectedCol >= 0 && selectedCol < col) {
                        if (seats[selectedRow][selectedCol].endsWith(available)) {
                            seats[selectedRow][selectedCol] = seats[selectedRow][selectedCol].substring(0, seats[selectedRow][selectedCol].length() - 1) + booked;
                            bookedSeats++;
                            System.out.println("Seat booked successfully!");
                        } else {
                            System.out.println("This seat is already booked. Please choose another one.");
                        }
                    } else {
                        System.out.println("Invalid seat selection. Please enter a valid row and column (e.g., B-2).");
                    }
                }
            }

            // Display updated seat availability
            System.out.println("\nUpdated Hall Seat:");
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No seats booked.");}
        System.out.println();
    }
}

