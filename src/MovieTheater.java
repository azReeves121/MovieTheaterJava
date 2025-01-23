import java.util.Scanner;



public class MovieTheater {

    private final int rows;
    private final int seatsPerRow;
    private final char[][] seats;


    public MovieTheater(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new char[rows][seatsPerRow];
        initializeSeats();
    }


    private void initializeSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = 'O';
            }
        }
    }

    public void displaySeating() {
        System.out.println("\nSeating Chart:");
        System.out.print("   ");
        for (int i = 0; i < seatsPerRow; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();



        for (int i = 0; i < rows; i++) {
            System.out.print((char) ('A' + i) + "  ");
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean reserveSeat(String seat) {
        if (!isValidSeat(seat)) {
            System.out.println("Invalid seat. Please try again.");
            return false;
        }
        int row = seat.charAt(0) - 'A';
        int col = Character.getNumericValue(seat.charAt(1)) - 1;

        if (seats[row][col] == 'X') {
            System.out.println("Seat " + seat + " is already reserved.");
            return false;
        }

        seats[row][col] = 'X';
        System.out.println("Seat " + seat + " has been reserved successfully.");
        return true;
    }















}
