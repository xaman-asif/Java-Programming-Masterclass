package chapter7.encapsulation.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumOfPagesPrinted());

        int pagesPrinted = printer.printPage(4);
        System.out.println("Page printed " + pagesPrinted + " Total printed " + printer.getNumOfPagesPrinted());

        pagesPrinted = printer.printPage(2);
        System.out.println("Page printed " + pagesPrinted + " Total printed " + printer.getNumOfPagesPrinted());
    }
}
