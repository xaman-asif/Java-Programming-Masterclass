package Java_Collections.comparable_and_comparator;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    //statics

    static final Comparator<Seat> PRICE_ORDER;
    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                return Double.compare(seat1.getPrice(), seat2.getPrice());
            }
        };
    }

    //constructor
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + numRows - 1;
        for (char row='A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if (row < 'D' && seatNum >= 4 && seatNum <= 9) {
                    price = 14.00;
                } else if (row > 'F' || seatNum < 4 || seatNum > 9) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }
    //getters
    public String getTheatreName() {
        return theatreName;
    }
    public Collection<Seat> getSeats() {
        return seats;
    }
    //methods
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);

        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }
    //inner class: seat
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.reserved = false;
        }
        //warning: implement compareTo method
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
        public String getSeatNumber() {
            return seatNumber;
        }
        public double getPrice() {
            return price;
        }
        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }
        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }
    }
}
