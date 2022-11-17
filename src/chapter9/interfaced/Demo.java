package chapter9.interfaced;

public class Demo {
    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();

        myPhone = new MobilePhone(017100);
        myPhone.dial(24565);
        myPhone.powerOn();
        myPhone.dial(24565);
    }
}
