package parkinglot;

public interface VehicleValidationStrategy {
    void validate(VehicleEntryEvent vehicle) throws IllegitimateVehicleException;
}
