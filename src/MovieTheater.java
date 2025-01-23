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






}
