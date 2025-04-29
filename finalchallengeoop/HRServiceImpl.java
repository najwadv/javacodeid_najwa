package finalchallengeoop;

import finalchallengeoop.allowances.Insurance;
import finalchallengeoop.allowances.Operational;
import finalchallengeoop.allowances.Overtime;
import finalchallengeoop.hr.*;
import finalchallengeoop.tax.Tax;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HRServiceImpl implements HRService {

    @Override
    public List<Employee> initEmployeeData() {
        List<Employee> employees = new ArrayList<>();

        Permanent perm1 = new Permanent(100,
                "Anton", LocalDate.of(2020,2,4),
                EmployeeType.PERMANENT,20_000_000,
                new Insurance(1,2,0.02),
                new Overtime(10,50_000),
                new Operational(2,30_000,20_000),
                new Tax(0.005,0.005,0));

        Permanent perm2 = new Permanent(101,
                "Budi", LocalDate.of(2021,2,4),
                EmployeeType.PERMANENT,15_000_000,
                new Insurance(1,3,0.02),
                new Overtime(5,50_000),
                new Operational(0,0,0),
                new Tax(0.005,0.005,0));

        Contract cont1 = new Contract(102,"Charlie",
                LocalDate.of(2022,2,4),EmployeeType.CONTRACT,
                15_000_000, new Insurance(1,0,0.02),
                new Overtime(5,45_000),
                new Operational(0,0,0),
                new Tax(0.005,0.005,0));

        Contract cont2 = new Contract(103,"Dian",
                LocalDate.of(2023,2,4),EmployeeType.CONTRACT,
                10_000_000, new Insurance(1,0,0.02),
                new Overtime(6,45_000),
                new Operational(0,0,0),
                new Tax(0.005,0.005,0));

        Trainee trainee = new Trainee(104,"Gita",
                LocalDate.of(2024,2,4),EmployeeType.TRAINEE,
                0, new Operational(25,30_000,20_000));

        Freelancer free = new Freelancer(105, "Rima",
                LocalDate.of(2025,2,4),EmployeeType.FREELANCER,
                0, 25_000_000, 0.025);

        // return List.of(perm1, perm2, cont1, cont2, trainee, free);
        employees.add(perm1);
        employees.add(perm2);
        employees.add(cont1);
        employees.add(cont2);
        employees.add(trainee);
        employees.add(free);
        return employees;
    }

    @Override
    public void displayEmployee(List<Employee> emps) {
        int totalEmployees = 0;
        int totalSalary = 0;
        int totalInsurance = 0;
        int totalOvertime = 0;
        int totalOperational = 0;
        int totalTax = 0;

        for (Employee emp : emps) {
            System.out.println(emp.toString());

            totalEmployees++;
            totalSalary += emp.getTotalSalary();
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalOperational += emp.getTotalOperational();
            totalTax += emp.getTotalTax();
        }

        System.out.println("\n===== SUMMARY =======");
        System.out.println("Total Employee     : " + totalEmployees);
        System.out.println("Total Salary       : Rp " + totalSalary);
        System.out.println("Total Insurance    : Rp " + totalInsurance);
        System.out.println("Total Overtime     : Rp " + totalOvertime);
        System.out.println("Total Operational  : Rp " + totalOperational);
        System.out.println("Total Tax          : Rp " + totalTax);
        System.out.println("=====================");
    }

    @Override
    public void getTotalEmployee(List<Employee> emps) {

    }

    @Override
    public void getEmployeeByType(List<Employee> emps, EmployeeType emptype) {

    }
}
