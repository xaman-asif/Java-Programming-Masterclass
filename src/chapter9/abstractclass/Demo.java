package chapter9.abstractclass;

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
