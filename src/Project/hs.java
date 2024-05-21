package Project;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class hs {

        static String idFormat(Character ch,Integer index,String type){
            return "| "+ch+"-"+index+"::"+type+" | ";
        }

        public static void main(String[] args) {
            String av = "AV";
            String bo = "BO";
            Character choose ;
            Scanner sc = new Scanner(System.in);
            System.out.printf("+----------------------------------------------------------------------------+%n");
            System.out.printf("|                             CSTAD HALL BOOKING SYSTEM                      |%n");
            System.out.printf("+----------------------------------------------------------------------------+%n");
            System.out.printf("> Config total row in hall: ");
            int row = sc.nextInt();
            System.out.print("> Config total seats per row in hall: ");
            int col = sc.nextInt();
            System.out.printf("+----------------------------------------------------------------------------+%n");
            String [][] hallA = new String[row][col];
            String [][] hallB = new String[row][col];
            String [][] hallC = new String[row][col];
            String[][] bookingHistory = new String[100][4]; // Maximum 100 booking history entries
            int bookingCount = 0; // Counter to keep track of booking entries
            Character chA = 'A';
            Character chB = 'A';
            Character chC = 'A';
            for(int i=0; i<hallA.length;i++){
                int index=0;
                for(int j=0; j<hallA[i].length;j++){
                    index++;
                    hallA[i][j] = idFormat(chA,index,av);
                }
                chA++;
            }
            for(int i=0; i<hallB.length;i++){
                int index=0;
                for(int j=0; j<hallB[i].length;j++){
                    index++;
                    hallB[i][j] = idFormat(chB,index,av);
                }
                chB++;
            }
            for(int i=0; i<hallC.length;i++){
                int index=0;
                for(int j=0; j<hallC[i].length;j++){
                    index++;
                    hallC[i][j] = idFormat(chC,index,av);
                }
                chC++;
            }
            do{
                System.out.println("\n[[ Application Menu ]]");
                System.out.println("<A> Booking");
                System.out.println("<B> Hall");
                System.out.println("<C> Showtime");
                System.out.println("<D> Reboot Showtime");
                System.out.println("<E> History");
                System.out.println("<F> Exit");
                System.out.print("> Please select menu no: ");
                choose = sc.next().toUpperCase().charAt(0);
                switch (choose){
                    case 'A':
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("|                                              Start booking process                                           |%n");
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("| Showtime information                                                                                         |%n");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+---------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","NO","SCHEDULE","TIME");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","A","Morning","10:00AM - 12:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","B","Afternoon","03:00PM - 05:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","C","Night","07:00PM - 09:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.print("Please select show time (A | B | C): ");
                        Character showTime = sc.next().toUpperCase().charAt(0);
                        do {
                            switch (showTime){
                                case 'A':
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| HALL A                                                                                                       |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    Character chA1 = 'A';
                                    for(int i=0; i<hallA.length;i++){
                                        for(int j=0; j<hallA[i].length;j++){
                                            System.out.print(hallA[i][j]);
                                        }
                                        chA1++;
                                        System.out.println();
                                    }
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| INSTRUCTION                                                                                                  |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.println("# Single: C-1");
                                    System.out.println("# Multiple (separate by comma): C-1,C-2");
                                    System.out.print("> Please select available seat: ");
                                    String idChairA = sc.next();

                                    String[] splitedA = idChairA.split(",");
                                    do {
                                        System.out.print("> Please enter student ID: ");
                                        String idStuA = sc.next();
                                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                        System.out.print("Are you sure to book? (Y/n): ");
                                        String continueOption = sc.next();
                                        if(!continueOption.equalsIgnoreCase("y")){
                                            System.out.println("Your booking is cancelled...");
                                            break;
                                        }else{
                                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
                                            LocalDateTime now = LocalDateTime.now();
                                            String dtfForHistory = dtf.format(now);
                                            bookingHistory[bookingCount][0] = "HALL A";
                                            bookingHistory[bookingCount][1] = idStuA;
                                            bookingHistory[bookingCount][2] = dtfForHistory;
                                            bookingHistory[bookingCount][3] = Arrays.deepToString(splitedA).toUpperCase();
                                            bookingCount++;
                                            for(String sp:splitedA){
                                                sp = "| "+sp.toUpperCase()+"::"+av+" | ";
                                                Character bookChA = 'A';
                                                for(int i=0;i<hallA.length;i++){
                                                    int index=0;
                                                    for(int j =0;j<hallA[i].length;j++){
                                                        index++;
                                                        if (hallA[i][j].equals(sp)){
                                                            hallA[i][j]=null;
                                                            hallA[i][j] = idFormat(bookChA,index,bo);
                                                        }
                                                    }
                                                    bookChA++;
                                                }
                                            }
                                            System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                            System.out.println("Your booking was successful...");
                                            break;
                                        }
                                    }while (true);
                                    break;
                                case 'B':
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| HALL B                                                                                                       |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    Character chB1 = 'A';
                                    for(int i=0; i<hallB.length;i++){
                                        for(int j=0; j<hallB[i].length;j++){
                                            System.out.print(hallB[i][j]);
                                        }
                                        chB1++;
                                        System.out.println();
                                    }
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| INSTRUCTION                                                                                                  |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.println("# Single: C-1");
                                    System.out.println("# Multiple (separate by comma): C-1,C-2");
                                    System.out.print("> Please select available seat: ");
                                    String idChairB = sc.next();
                                    String[] splitedB = idChairB.split(",");
                                    do {
                                        System.out.print("> Please enter student ID: ");
                                        String idStu = sc.next();
                                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                        System.out.print("Are you sure to book? (Y/n): ");
                                        String continueOption = sc.next();
                                        if(!continueOption.equalsIgnoreCase("y")){
                                            System.out.println("Your booking is cancelled...");
                                            break;
                                        }else{
                                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
                                            LocalDateTime now = LocalDateTime.now();
                                            String dtfForHistory = dtf.format(now);
                                            bookingHistory[bookingCount][0] = "HALL B";
                                            bookingHistory[bookingCount][1] = idStu;
                                            bookingHistory[bookingCount][2] = dtfForHistory;
                                            bookingHistory[bookingCount][3] = Arrays.deepToString(splitedB).toUpperCase();
                                            bookingCount++;
                                            for(String sp:splitedB){
                                                sp = "| "+sp.toUpperCase()+"::"+av+" | ";
                                                Character bookChB = 'A';
                                                for(int i=0;i<hallB.length;i++){
                                                    int index=0;
                                                    for(int j =0;j<hallB[i].length;j++){
                                                        index++;
                                                        if (hallB[i][j].equals(sp)){
                                                            hallB[i][j]=null;
                                                            hallB[i][j] = idFormat(bookChB,index,bo);
                                                        }
                                                    }
                                                    bookChB++;
                                                }
                                            }
                                            System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                            System.out.println("Your booking was successful...");
                                            break;
                                        }
                                    }while (true);
                                    break;
                                case 'C':
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| HALL C                                                                                                       |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    Character chC1 = 'A';
                                    for(int i=0; i<hallC.length;i++){
                                        for(int j=0; j<hallC[i].length;j++){
                                            System.out.print(hallC[i][j]);
                                        }
                                        chC1++;
                                        System.out.println();
                                    }
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.printf("| INSTRUCTION                                                                                                  |%n");
                                    System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                    System.out.println("# Single: C-1");
                                    System.out.println("# Multiple (separate by comma): C-1,C-2");
                                    System.out.print("> Please select available seat: ");
                                    String idChairC = sc.next();
                                    String[] splitedC = idChairC.split(",");
                                    do {
                                        System.out.print("> Please enter student ID: ");
                                        String idStuC = sc.next();
                                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                        System.out.print("Are you sure to book? (Y/n): ");
                                        String continueOption = sc.next();
                                        if(!continueOption.equalsIgnoreCase("y")){
                                            System.out.println("Your booking is cancelled...");
                                            break;
                                        }else{
                                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
                                            LocalDateTime now = LocalDateTime.now();
                                            String dtfForHistory = dtf.format(now);
                                            bookingHistory[bookingCount][0] = "HALL C";
                                            bookingHistory[bookingCount][1] = idStuC;
                                            bookingHistory[bookingCount][2] = dtfForHistory;
                                            bookingHistory[bookingCount][3] = Arrays.deepToString(splitedC).toUpperCase();
                                            bookingCount++;
                                            for(String sp:splitedC){
                                                sp = "| "+sp.toUpperCase()+"::"+av+" | ";
                                                Character bookChC = 'A';
                                                for(int i=0;i<hallC.length;i++){
                                                    int index=0;
                                                    for(int j =0;j<hallC[i].length;j++){
                                                        index++;
                                                        if (hallC[i][j].equals(sp)){
                                                            hallC[i][j]=null;
                                                            hallC[i][j] = idFormat(bookChC,index,bo);
                                                        }
                                                    }
                                                    bookChC++;
                                                }
                                            }
                                            System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                                            System.out.println("Your booking was successful...");
                                            break;
                                        }
                                    }while (true);
                                    break;
                                default:
                                    System.out.println("Invalid show time");
                                    break;
                            }
                            break;
                        }while (true);
                        break;
                    case 'B':
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("|                                             Hall Information                                                 |%n");
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("| Hall Morning                                                                                                 |%n");
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        for (String[] halls: hallA){
                            for(String hallArr: halls){
                                System.out.print(hallArr);
                            }
                            System.out.println();
                        }
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("| Hall Afternoon                                                                                               |%n");
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        for (String[] halls: hallB){
                            for(String hallArr: halls){
                                System.out.print(hallArr);
                            }
                            System.out.println();
                        }
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("| Hall Night                                                                                                   |%n");
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");
                        Character chC1 = 'A';
                        for (String[] halls: hallC){
                            for(String hallArr: halls){
                                System.out.print(hallArr);
                            }
                            System.out.println();
                        }
                        System.out.printf("+--------------------------------------------------------------------------------------------------------------+%n");

                        break;
                    case 'C':
                        System.out.printf("+----------------------------------------------------------------------------+%n");
                        System.out.printf("|                     Daily Showtime of CSTAD Hall                           |%n");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","NO","SCHEDULE","TIME");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","A","Morning","10:00AM - 12:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","B","Afternoon","03:00PM - 05:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        System.out.printf("| %-5s | %-30s | %-33s | %n","C","Night","07:00PM - 09:30PM");
                        System.out.printf("+-------+--------------------------------+-----------------------------------+%n");
                        break;
                    case 'D':
                        Character chRebootA = 'A';
                        for(int i=0;i<hallA.length;i++){
                            int index=1;
                            for(int j =0;j<hallA[i].length;j++){
                                hallA[i][j] = idFormat(chRebootA,index,av);
                                index++;
                            }
                            chRebootA++;
                        }
                        Character chRebootB = 'A';
                        for(int i=0;i<hallB.length;i++){
                            int index=1;
                            for(int j =0;j<hallB[i].length;j++){
                                hallB[i][j] = idFormat(chRebootB,index,av);
                                index++;
                            }
                            chRebootB++;
                        }
                        Character chRebootC = 'A';
                        for(int i=0;i<hallC.length;i++){
                            int index=1;
                            for(int j =0;j<hallC[i].length;j++){
                                hallA[i][j] = idFormat(chRebootC,index,av);
                                index++;
                            }
                            chRebootC++;
                        }
                        System.out.println("Reboot Successfully...");
                        break;
                    case 'E':
                        // Display booking history
                        System.out.printf("+----------------------------------------------------------------------------------------------------------------+%n");
                        System.out.printf("|                                           Booking History                                                      |%n");
                        System.out.printf("+-------+----------------------+--------------------------------+---------------------------+--------------------+%n");
                        System.out.printf("| %-5s | %-25s | %-25s | %-25s | %-25s|%n","NO","HALL","STUDENTID","CURRENTDATE","SEATSID");
                        System.out.printf("+-------+----------------------+--------------------------------+---------------------------+--------------------+%n");
                        for (int i = 0; i < bookingCount; i++) {
                            System.out.printf("| %-5s | ",i);
                            for (int j = 0; j < 4; j++) {
                                System.out.printf("%-25s | ",bookingHistory[i][j]);
                            }
                            System.out.printf("%n+----------------------------------------------------------------------------------------------------------------+%n");
                        }
                        break;
                    case 'F':
                        System.out.println("Exiting the system...");
                        break;

                    default:
                        System.out.printf("+----------------------------------------------------------------------------+%n");
                        System.out.printf("|               Invalid option. Please choose again.                         |%n");
                        System.out.printf("+----------------------------------------------------------------------------+%n");
                        break;
                }
            }while (choose != 'F');
        }
    }

