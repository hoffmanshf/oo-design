package parkinglot;

public interface BillService {
    void startBilling(VehicleEntryEvent vehicleEntryEvent);

    ParkingBill calculateBill(VehicleExitEvent vehicleExitEvent);
}
