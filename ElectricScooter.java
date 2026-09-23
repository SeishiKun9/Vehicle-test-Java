public class ElectricScooter extends Vehicle {
    public ElectricScooter(String modelName, double fuelLevel) {
        super(modelName, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double batteryNeeded = distance * 0.1;
        if (fuelLevel >= batteryNeeded) {
            fuelLevel -= batteryNeeded;
            System.out.printf("%s zipped %.1f km. Remaining battery: %.1f%%.%n",
                    modelName, distance, fuelLevel);
        } else {
            System.out.printf("%s cannot drive %.1f km: low battery.%n", modelName, distance);
        }
    }
}
