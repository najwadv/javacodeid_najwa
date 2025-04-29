package finalchallengeoop.allowances;

import java.time.LocalDate;

public class Allowance {
    private double totalAllowance;
    private LocalDate payDay;

    public Allowance(LocalDate payDay) {
        this.payDay = payDay;
    }

    public LocalDate getPayDay() {
        return payDay;
    }

    public void setPayDay(LocalDate payDay) {
        this.payDay = payDay;
    }

    /*public Allowance(double totalAllowance) {
        this.totalAllowance = totalAllowance;
    }

    public double getTotalAllowance() {
        return totalAllowance;
    }

    public void setTotalAllowance(double totalAllowance) {
        this.totalAllowance = totalAllowance;
    }*/
}
