package finalchallengeoop;

import finalchallengeoop.hr.Contract;
import finalchallengeoop.hr.Employee;
import finalchallengeoop.hr.EmployeeType;
import finalchallengeoop.hr.Permanent;

import java.util.List;

public class SalaryServiceImpl implements SalaryService {

    @Override
    public void generateOvertime(List<Employee> emps) {
        for (Employee emp : emps) {
            emp.calcTotalOvertime();
        }
    }

    @Override
    public void generateInsurance(List<Employee> emps) {
        for (Employee emp : emps) {
            emp.calcTotalInsurance();
        }
    }

    @Override
    public void generateOperational(List<Employee> emps) {
        for (Employee emp : emps) {
            emp.calcTotalOperational();
        }
    }

    @Override
    public void generateTax(List<Employee> emps) {
        for (Employee emp : emps) {
            emp.calcTax();
        }
    }

    @Override
    public void generateSalary(List<Employee> emps) {
        for (Employee emp : emps) {
            emp.calcTotalSalary();
        }
    }

    @Override
    public double getTotalAllowances(List<Employee> emps) {
        return 0;
    }

    @Override
    public double getTotalSalaryByType(List<Employee> emps, EmployeeType emptype) {
        return 0;
    }
}
