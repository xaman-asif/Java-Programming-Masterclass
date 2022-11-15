package chapter8.autoboxing.challenge;

public class AutoboxingChallenge {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bangladesh Bank");

        bank.addBranch("Dhaka");

        bank.addNewCustomer("Dhaka", "John", 10.10);

        bank.addNewCustomer("Sylhet", "Doe", 89.90);

        bank.addNewCustomer("Dhaka", "Jane", 0.0);

        bank.addCustomerTransaction("Dhaka", "John", 100);

        bank.listCustomer("Dhaka", true);

    }
}
