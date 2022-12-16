package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.arraylist.challenge;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
