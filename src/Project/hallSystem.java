package Project;
import java.util.Scanner;

public class hallSystem {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char letter= 'A';
        String av="AV";
        String bo="BO";
        System.out.print("Enter row:");
        int row=scanner.nextInt();
        System.out.print("Enter col:");
        int col=scanner.nextInt();
        String[][] seats= new String[row][col];
        for(int i=0;i<seats.length;i++){
            int index=1;
            for(int j=0;j<seats[i].length;j++){
                seats[i][j]=letter+"-"+index+"::"+av;
//                System.out.print(seats[i][j]+ " ");
                index++;
            }
            letter++;
//            System.out.println();
        }

        int choose=0;
        do{
            System.out.println("==============Hall System==============");
            System.out.println("1.Hall Booking");
            System.out.println("2.Hall Checking");
            System.out.println("3.Showtime Checking");
            System.out.println("4.Booking History");
            System.out.println("5.Rebooting Hall");
            System.out.println("6. Exit");

            System.out.println("=======================================");
            System.out.print("Please choose the option:");
            choose=scanner.nextInt();
            switch (choose){
                case 1:hallBooking();
                    break;
                case 2:hallChecking(seats);
                    break;
                case 3:showtimeChecking();
                    break;
                case 4:bookingHistory();
                    break;
                case 5:rebootingHall();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choose!=7);
    }
    static void hallBooking(){
        System.out.println("==========================Information Hall Booking==========================");
        showtimeChecking();
        System.out.println("==========================================");
        char letter= 'A';
        System.out.print("#Student card ID:");
        int id= new Scanner(System.in).nextInt();
        System.out.print("Enter row:");
        int row=new Scanner(System.in).nextInt();
        System.out.print("Enter col:");
        int col=new Scanner(System.in).nextInt();
        System.out.println("Enter seatsNo:");
        int seatsNo = new Scanner(System.in).nextInt();
        String[][] seats= new String[row][col];
        for(int i=0;i<seats.length;i++){
            int index=1;
            for(int j=0;j<seats[i].length;j++){
                seats[i][j]="|"+letter + "-" + index +"|"+":" ;
                System.out.print(seats[i][j]+ " ");
                index++;
            }
            letter++;
            System.out.println();
        }
    }
    static void hallChecking(String[][] seats){
        System.out.println("===========HallChecking=========");

        char letter= 'A';
        String av="AV";
        String bo="BO";

        for(int i=0; i<seats.length;i++){
            int index=1;
            for(int j=0;j<seats[i].length;j++){
                if(seats[i][j].contains(av)){
                    System.out.println(seats[i][j]+av);
                }
                else {
                    System.out.print(seats[i][j]+bo);
                }
                index++;
            }
            letter++;
            System.out.println();
        }
        /*
        index= i*seats.length+j+1;
        if (!seatNo.equals(seats[i][j])){
            seats[i][j] = letter + "-" + index + "::" +"bo|id:"+id;
            System.out.println("booked");

        } else {
            seats[i][j] = letter + "-" + index + "::" +"av|id:"+id;
            System.out.println("Available");
        }
         */

    }
    static void showtimeChecking(){
        System.out.println("==========showtimeChecking==========");
        System.out.println("morning:7:00am-11:00pm");
        System.out.println("Afternoon:11:00pm-5:00pm");
        System.out.println("Night:5:00pm-11:00pm");
    }
    static void bookingHistory(){
        System.out.println("==========bookingHistory==========");
        Boolean hallBooking = new Boolean(true);
        if(hallBooking.equals(true)){
            System.out.println("Hall booking Avalible");
        }
        else {
            System.out.println("Hall booked already");
        }

    }
    static void rebootingHall(){
        System.out.println("=================Rebooting System===============");
        boolean hallRebooting = false;

        if (!hallRebooting) {
            System.out.println("Rebooting System......");
        } else {
            System.out.println("Let's start learning HallRebooting");
        }
    }
}