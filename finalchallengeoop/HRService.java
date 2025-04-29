package finalchallengeoop;

import finalchallengeoop.hr.Employee;
import finalchallengeoop.hr.EmployeeType;

import java.util.List;

public interface HRService {
    List<Employee> initEmployeeData();

    public void displayEmployee(List<Employee> emps);
    public void getTotalEmployee(List<Employee> emps);
    public void getEmployeeByType(List<Employee> emps, EmployeeType emptype);
}
