package vehicleManagement;

public class Vehicle {
    private final String brand;
    private final String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + brand + " " + model);
    }
}