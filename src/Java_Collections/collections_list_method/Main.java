package Java_Collections.collections_list_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List <Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);

        printList(theatre.seats);
        Collections.reverse(seatCopy);
        printList(seatCopy);

        Collections.shuffle(theatre.seats);
        printList(theatre.seats);

        sortList(theatre.seats);
        printList(theatre.seats);

        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList, theatre.seats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=========================================================");
    }
    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i=0; i<list.size() - 1; i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
