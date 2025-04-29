package finalchallengeoop.hr;

import finalchallengeoop.AllowanceService;
import finalchallengeoop.allowances.POService;

import java.time.LocalDate;

public class Freelancer extends Employee implements AllowanceService, POService {

    private double po;
    private double ppn;

    public Freelancer(int empNo, String fullName, LocalDate hireDate, EmployeeType status, double salary, double po, double ppn) {
        super(empNo, fullName, hireDate, status, salary);
        this.po = po;
        this.ppn = ppn;
    }

    public double getPo() {
        return po;
    }

    public void setPo(double po) {
        this.po = po;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }

    @Override
    public void calcTotalSalary() {
        setTotalSalary(po -  getTotalTax());
    }

    @Override
    public void calcTotalOvertime() {

    }

    @Override
    public void calcTotalOperational() {

    }

    @Override
    public void calcTotalInsurance() {

    }

    @Override
    public void calcTax() {
        setTotalTax(po * ppn);
    }

    @Override
    public double totalPO() {
        int totalPO = 0;
        return totalPO+=po;
    }

    @Override
    public void calcTapera() {

    }

    @Override
    public void calcPpn() {

    }
}
