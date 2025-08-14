package vehicleManagement;

public class VehicleManagement {
    public static void main(String[] args) {
        var car = new Car("BMW", "X5", 4);
        car.displayInfo();

        var motorcycle = new Motorcycle("Honda", "Civic", true);
        motorcycle.displayInfo();
    }
}
