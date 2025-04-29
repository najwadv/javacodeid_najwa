package finalchallengeoop.hr;

import finalchallengeoop.AllowanceService;
import finalchallengeoop.allowances.Operational;

import java.time.LocalDate;

public class Trainee extends Employee implements AllowanceService {
    private Operational operational;

    public Trainee(int empNo, String fullName, LocalDate hireDate, EmployeeType status, double salary, Operational operational) {
        super(empNo, fullName, hireDate, status, salary);
        this.operational = operational;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    @Override
    public void calcTotalSalary() {
        setTotalSalary((getSalary()+getTotalInsurance()+getTotalOperational())-(getTotalInsurance()+getTotalTax()));
    }

    @Override
    public void calcTotalOvertime() {

    }

    @Override
    public void calcTotalOperational() {
        setTotalOperational((operational.getLunch()+operational.getTransport()) * operational.getDays());
    }

    @Override
    public void calcTotalInsurance() {

    }

    @Override
    public void calcTax() {

    }

    @Override
    public void calcTapera() {

    }

    @Override
    public void calcPpn() {

    }
}
