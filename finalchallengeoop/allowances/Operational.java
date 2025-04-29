package finalchallengeoop.allowances;

import java.time.LocalDate;

public class Operational extends Allowance {
    private int days;
    private double lunch;
    private double transport;

    public Operational(int days, double lunch, double transport) {
        super(LocalDate.now());
        this.days = days;
        this.lunch = lunch;
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getLunch() {
        return lunch;
    }

    public void setLunch(double lunch) {
        this.lunch = lunch;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }

    /* public double getHotel() {
        return hotel;
    }

    public void setHotel(double hotel) {
        this.hotel = hotel;
    }*/
}
