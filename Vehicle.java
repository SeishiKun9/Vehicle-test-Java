public abstract class Vehicle {
    protected String modelName;
    protected double fuelLevel;

    public Vehicle(String modelName, double fuelLevel) {
        this.modelName = modelName;
        this.fuelLevel = fuelLevel;
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        if (fuelLevel > 100.0) {
            fuelLevel = 100.0;
        }

        System.out.printf("%s refueled to %.1f%%.%n", modelName, fuelLevel);
    }

    public abstract void drive(double distance);
}
