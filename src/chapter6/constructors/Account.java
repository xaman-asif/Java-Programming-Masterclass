package chapter6.constructors;

public class Account {
    private String account;
    private double balance;
    private String name;
    private String email;
    private String phone;
    public Account() {
        this("12345", 0.0, "Bob Brown", "myemail@gmail.com", "(087) 123-4567");
        System.out.println("Empty constructor called");
    }
    public Account(String account, double balance, String name, String email, String phone) {
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(Double balance) {
        this.balance += balance;
        System.out.println("Deposited amount: " + balance);
    }
    public void withdraw(Double balance) {
        if (this.balance - balance >= 0) {
            this.balance -= balance;
            System.out.println("Withdrawn amount: " + balance);
        } else {
            System.out.println("Not enough balance to withdraw!");
        }
    }
}

