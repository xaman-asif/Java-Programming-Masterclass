package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.autoboxing.challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double initial) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initial);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
