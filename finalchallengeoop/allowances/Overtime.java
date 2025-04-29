package finalchallengeoop.allowances;

import java.time.LocalDate;

public class Overtime extends Allowance {
     private double hours;
     private double uangLembur;

    public Overtime(double hours, double uangLembur) {
        super(LocalDate.now());
        this.hours = hours;
        this.uangLembur = uangLembur;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getUangLembur() {
        return uangLembur;
    }

    public void setUangLembur(double uangLembur) {
        this.uangLembur = uangLembur;
    }
}
