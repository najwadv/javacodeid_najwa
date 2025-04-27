package ch_day03;

import java.time.LocalDate;

public class Taxi extends Car {
    private int order;
    private double orderPerKM;

    public Taxi(String noPolice, int year, double price, double taxInYear, int seat, LocalDate transactionDate, int order, double orderPerKM) {
        super(noPolice, VehicleType.TAXI, year, price, taxInYear, seat, transactionDate);
        this.order = order;
        this.orderPerKM = orderPerKM;
        super.setTotal(order*orderPerKM);
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
        super.setTotal(order * orderPerKM);
    }

    public double getOrderPerKM() {
        return orderPerKM;
    }

    public void setOrderPerKM(double orderPerKM) {
        this.orderPerKM = orderPerKM;
        super.setTotal(order * orderPerKM);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", order=" + order +
                ", orderPerKM=" + orderPerKM +
                '}';
    }
}
