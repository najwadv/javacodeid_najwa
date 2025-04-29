package finalchallengeoop;

import finalchallengeoop.hr.Employee;
import finalchallengeoop.hr.EmployeeType;

import java.util.List;

public interface SalaryService {
    public void generateOvertime(List<Employee> emps);
    public void generateInsurance(List<Employee> emps);
    public void generateOperational(List<Employee> emps);
    public void generateTax(List<Employee> emps);


    public void generateSalary(List<Employee> emps);
    public double getTotalAllowances(List<Employee> emps);
    public double getTotalSalaryByType(List<Employee> emps, EmployeeType empType);
}