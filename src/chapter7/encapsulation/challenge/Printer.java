package chapter7.encapsulation.challenge;

public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public int fillUpToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
            this.numOfPagesPrinted += pagesToPrint;
            System.out.println("Printing page in duplex mode");
        } else {
            this.numOfPagesPrinted += pagesToPrint;
            System.out.println("Printing page in simplex mode");
        }
        return pagesToPrint;
    }
}
