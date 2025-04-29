package finalchallengeoop.allowances;

import java.time.LocalDate;

public class Insurance extends Allowance {
    private int self;
    private int dependent;
    private double medical;

    public Insurance(int self, int dependent, double medical) {
        super(LocalDate.now());
        this.self = self;
        this.dependent = dependent;
        this.medical = medical;
    }

    public int getSelf() {
        return self;
    }

    public void setSelf(int self) {
        this.self = self;
    }

    public int getDependent() {
        return dependent;
    }

    public void setDependent(int dependent) {
        this.dependent = dependent;
    }

    public double getMedical() {
        return medical;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }
}
