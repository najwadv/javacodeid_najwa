package finalchallengeoop;

public class Main {
    public static void main(String[] args) {
        HRService hrInterface = new HRServiceImpl();
        SalaryService salaryInterface = new SalaryServiceImpl();

        var employees = hrInterface.initEmployeeData();

        salaryInterface.generateSalary(employees);
        salaryInterface.generateOperational(employees);
        salaryInterface.generateOvertime(employees);
        salaryInterface.generateInsurance(employees);

        salaryInterface.generateTax(employees);

        salaryInterface.generateSalary(employees);

        hrInterface.displayEmployee(employees);
    }
}
