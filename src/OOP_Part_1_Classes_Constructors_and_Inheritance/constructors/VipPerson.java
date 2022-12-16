package OOP_Part_1_Classes_Constructors_and_Inheritance.constructors;

public class VipPerson {
    private String name;
    private double creditlimit;
    private String emailAddress;

    public VipPerson(String name, double creditlimit, String emailAddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailAddress = emailAddress;
    }

    public VipPerson(String name, double creditlimit) {
        this(name, creditlimit, "unknown@email.com");
    }

    public VipPerson() {
        this("Default Name", 50_000.00, "default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
