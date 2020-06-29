package parkinglot;

public class Bus extends Vehicle {

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.LARGE;
    }
}
