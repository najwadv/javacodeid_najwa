package ch_day03;

import java.time.LocalDate;

public class Car extends VehiclePurchase {
    public Car(String noPolice, VehicleType vehicleType, int year, double price, double taxInYear, int seat, LocalDate transactionDate) {
        super(noPolice, vehicleType, year, price, taxInYear, seat, transactionDate);
        totalCar++;
    }
}
