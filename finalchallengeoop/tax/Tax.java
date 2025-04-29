package finalchallengeoop.tax;

import finalchallengeoop.allowances.Allowance;

import java.time.LocalDate;

public class Tax extends Allowance {
    private double pph;
    private double tapera;
    private double ppn;

    public Tax(double pph, double tapera, double ppn) {
        super(LocalDate.now());
        this.pph = pph;
        this.tapera = tapera;
        this.ppn = ppn;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }

    public double getTapera() {
        return tapera;
    }

    public void setTapera(double tapera) {
        this.tapera = tapera;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }
}
