package vehicleManagement;

public class Motorcycle extends Vehicle {
    private final boolean hasCarrier;

    public Motorcycle(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + getBrand() + " " + getModel() + (hasCarrier ? " with carrier" : ""));
    }
}