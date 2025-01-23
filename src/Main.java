import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MovieTheater movieTheater = new MovieTheater(5, 6);
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("\n--- Movie Theater Booking System ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    movieTheater.displaySeating();
                    break;
                case 2:
                    System.out.print("Enter seat to reserve (e.g., A3): ");
                    String reserveSeat = scanner.next().toUpperCase();
                    if (!movieTheater.reserveSeat(reserveSeat)) {
                        movieTheater.suggestAvailableSeat();
                    }
                    break;
                case 3:
                    System.out.print("Enter seat to cancel (e.g., A3): ");
                    String cancelSeat = scanner.next().toUpperCase();
                    movieTheater.cancelSeat(cancelSeat);
                    break;
                case 4:
                    System.out.println("Thank you for using the Movie Theater Booking System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }










        }
    }
