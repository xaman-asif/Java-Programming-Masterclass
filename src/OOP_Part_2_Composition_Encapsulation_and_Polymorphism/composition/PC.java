package OOP_Part_2_Composition_Encapsulation_and_Polymorphism.composition;

/**
 * Created by keanehubertang on 8/3/15.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();

    }
    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
