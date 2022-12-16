package OOP_Part_1_Classes_Constructors_and_Inheritance.constructors;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (model.equals(validModel)) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }
}
