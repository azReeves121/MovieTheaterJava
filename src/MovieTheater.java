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






}
