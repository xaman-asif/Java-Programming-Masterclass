package Inner_and_Abstract_Classes_and_Interfaces.abstractclass;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggo");
        dog.breath();
        dog.eat();

        Bird bird = new Parrot("Parrot");
        bird.breath();
        bird.eat();
        bird.fly();
    }
}

