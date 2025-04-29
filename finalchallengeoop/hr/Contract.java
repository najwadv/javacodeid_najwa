package finalchallengeoop.hr;

import finalchallengeoop.AllowanceService;
import finalchallengeoop.allowances.Insurance;
import finalchallengeoop.allowances.Operational;
import finalchallengeoop.allowances.Overtime;
import finalchallengeoop.tax.Tax;

import java.time.LocalDate;

public class Contract extends Employee implements AllowanceService {
    private Insurance insurance;
    private Overtime overtime;
    private Operational operational;
    private Tax tax;

    public Contract(int empNo, String fullName, LocalDate hireDate, EmployeeType status, double salary, Insurance insurance, Overtime overtime, Operational operational, Tax tax) {
        super(empNo, fullName, hireDate, status, salary);
        this.insurance = insurance;
        this.overtime = overtime;
        this.operational = operational;
        this.tax = tax;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    @Override
    public void calcTotalSalary() {
        setTotalSalary((getSalary()+getTotalOvertime()+getTotalOperational())-(getTotalInsurance()+getTotalTax()));
    }

    @Override
    public void calcTotalOvertime() {
        setTotalOvertime(overtime.getUangLembur()*overtime.getHours());
    }

    @Override
    public void calcTotalOperational() {
        setTotalOperational((operational.getLunch()+operational.getTransport()) * operational.getDays());
    }

    @Override
    public void calcTotalInsurance() {
        setTotalInsurance((getSalary()*insurance.getMedical())*(insurance.getSelf()+insurance.getDependent()));
    }

    @Override
    public void calcTax() {
        setTotalTax((getSalary()*tax.getPph()) + (getSalary()*tax.getTapera()));
    }

    @Override
    public void calcTapera() {

    }

    @Override
    public void calcPpn() {

    }
}
