public class DeliveryTruck extends Vehicle {
    public DeliveryTruck(String modelName, double fuelLevel) {
        super(modelName, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * 0.5;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            System.out.printf("%s hauled cargo for %.1f km. Remaining fuel: %.1f%%.%n",
                    modelName, distance, fuelLevel);
        } else {
            System.out.printf("%s cannot drive %.1f km: not enough fuel.%n", modelName, distance);
        }
    }
}
