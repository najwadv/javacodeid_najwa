package ch_day03;

import java.time.LocalDate;

public class Plane extends VehiclePurchase {
    private double orderPerHours;

    public double getOrderPerHours() {
        return orderPerHours;
    }

    public void setOrderPerHours(double orderPerHours) {
        this.orderPerHours = orderPerHours;
        super.setTotal(orderPerHours);
    }

    public Plane(String noPolice, int year, double price, double taxInYear, int seat, LocalDate transactionDate, double orderPerHours) {
        super(noPolice, VehicleType.PRIVATE_JET, year, price, taxInYear, seat, transactionDate);
        this.orderPerHours = orderPerHours;
        totalPlane++;
        super.setTotal(orderPerHours);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", orderPerHours=" + orderPerHours +
                '}';
    }
}
