package OOP_Part_2_Composition_Encapsulation_and_Polymorphism.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out.");
        }
    }
    public int healthRemaining() {
        return this.health;
    }
}
