public class Main {
    public static void main(String[] args) {
        

        DeliveryTruck truck = new DeliveryTruck("Delivery Truck", 40.0);
        ElectricScooter scooter = new ElectricScooter("Electric Scooter", 15.0);
        CargoAirplane airplane = new CargoAirplane("Cargo Airplane", 100.0);

        truck.drive(80.0);
        truck.drive(1.0);
        truck.refuel(25.0);
        truck.drive(30.0);

        scooter.drive(50.0);

        airplane.drive(70.0);
        airplane.refuel(10.0);
        airplane.drive(60.0);
    }
}
