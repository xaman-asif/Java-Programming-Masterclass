package chapter12.collections_overview;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
        if (theatre.reservedSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
