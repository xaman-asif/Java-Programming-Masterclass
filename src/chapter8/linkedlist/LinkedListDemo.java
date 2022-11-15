package chapter8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new java.util.LinkedList<>();
        /*----Data Entry----*/
        addInOrder(placesToVisit, "Dhaka");
        addInOrder(placesToVisit, "Khulna");
        addInOrder(placesToVisit, "Chittagong");
        addInOrder(placesToVisit, "Rajshahi");
        addInOrder(placesToVisit, "Sylhet");

        printList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }

        System.out.println("============================");
    }

    private static void addInOrder(LinkedList<String> placesToVisit, String newCity) {
        ListIterator<String> stringListIterator = placesToVisit.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already as a destination.");
                return;
            } else if (comparison > 0) {
                //new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return;
            }
        }
        stringListIterator.add(newCity);
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities at the moment");
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday vacation over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached the first of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println( "0 - to quit\n"+
                            "1 - go to next city\n"+
                            "2 - go to prev city\n"+
                            "3 - print menu\n"
                );
    }
}
