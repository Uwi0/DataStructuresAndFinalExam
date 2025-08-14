package vehicleManagement;

public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getBrand() + " " + getModel() + " with " + numberOfDoors + " doors");
    }
}