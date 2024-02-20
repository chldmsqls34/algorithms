package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBMI() {

        double bmi = weight / (height / 100) * (height / 100);

        this.bmi = bmi;
    }
    public void createBodyMass() {
        String bodyMass = "";

        this.bodyMass = bodyMass;
    }
}
