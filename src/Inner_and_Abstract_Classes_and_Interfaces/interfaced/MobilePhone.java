package Inner_and_Abstract_Classes_and_Interfaces.interfaced;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone turned on");
    }


    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on deskphone");
        } else {
            System.out.println("Turn on mobile phone first");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melodic ringing");
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
