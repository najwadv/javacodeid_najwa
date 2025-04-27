package ch_day03;

import java.time.LocalDate;

public class VehiclePurchase {
    private String noPolice;
    private VehicleType vehicleType;
    private int year;
    private double price;
    private double taxInYear;
    private int seat;
    private LocalDate transactionDate;
    private double total;

    public static int totalCar;
    public static int totalBoat;
    public static int totalPlane;

    public VehiclePurchase(String noPolice, VehicleType vehicleType, int year, double price, double taxInYear, int seat, LocalDate transactionDate) {
        this.noPolice = noPolice;
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.taxInYear = taxInYear;
        this.seat = seat;
        this.transactionDate = transactionDate;
    }

    public String getNoPolice() {
        return noPolice;
    }

    public void setNoPolice(String noPolice) {
        this.noPolice = noPolice;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        /* if (price > 100E9){
            throw new IllegalArgumentException("Price > 10jt");
        }*/
        this.price = price;
    }

    public double getTaxInYear() {
        return taxInYear;
    }

    public void setTaxInYear(double taxInYear) {
        this.taxInYear = taxInYear;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        VehiclePurchase.totalCar = totalCar;
    }

    public static int getTotalBoat() {
        return totalBoat;
    }

    public static void setTotalBoat(int totalBoat) {
        VehiclePurchase.totalBoat = totalBoat;
    }

    public static int getTotalPlane() {
        return totalPlane;
    }

    public static void setTotalPlane(int totalPlane) {
        VehiclePurchase.totalPlane = totalPlane;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "VehiclePurchase{" +
                "noPolice='" + noPolice + '\'' +
                ", vehicleType=" + vehicleType +
                ", year=" + year +
                ", price=" + price +
                ", taxInYear=" + taxInYear +
                ", seat=" + seat +
                ", transactionDate=" + transactionDate +
                ", total=" + total +
                '}';
    }
}
