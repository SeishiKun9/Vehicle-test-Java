public class CargoAirplane extends Vehicle {
    public CargoAirplane(String modelName, double fuelLevel) {
        super(modelName, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * 1.5;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            System.out.printf("%s flew %.1f km through the air. Remaining fuel: %.1f%%.%n",
                    modelName, distance, fuelLevel);
        } else {
            System.out.printf("%s flight canceled due to low fuel for %.1f km.%n",
                    modelName, distance);
        }
    }
}
