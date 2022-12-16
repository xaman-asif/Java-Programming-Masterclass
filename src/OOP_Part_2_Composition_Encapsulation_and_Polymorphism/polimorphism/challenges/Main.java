package OOP_Part_2_Composition_Encapsulation_and_Polymorphism.polimorphism.challenges;

class Car {
    private String name;
    private boolean engine;
    private int numOfCylinders;
    private int numOfWheels;

    public Car(String name, int numOfCylinders) {
        this.name = name;
        this.engine = true;
        this.numOfCylinders = numOfCylinders;
        this.numOfWheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }
}

class Mitshubishi extends Car {
    public Mitshubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitshubishi = new Mitshubishi("Outlander VRW 4WD", 6);
        System.out.println(mitshubishi.startEngine());
        System.out.println(mitshubishi.accelerate());
        System.out.println(mitshubishi.brake());
    }
}
