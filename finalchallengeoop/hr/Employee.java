package finalchallengeoop.hr;

import java.time.LocalDate;

public class Employee {
    private int empNo;
    private String fullName;
    private LocalDate hireDate;
    private EmployeeType status;
    private double salary;
    private double totalSalary;
    private double totalInsurance;
    private double totalOvertime;
    private double totalTax;
    private double totalOperational;

    public Employee(int empNo, String fullName, LocalDate hireDate, EmployeeType status, double salary) {
        this.empNo = empNo;
        this.fullName = fullName;
        this.hireDate = hireDate;
        this.status = status;
        this.salary = salary;
    }

    public void calcTotalSalary() {}
    public void calcTotalOvertime() {}
    public void calcTotalOperational() {}
    public void calcTax() {}
    public void calcTotalInsurance() {}

    public double getTotalInsurance() {
        return totalInsurance;
    }

    public void setTotalInsurance(double totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    public double getTotalOvertime() {
        return totalOvertime;
    }

    public void setTotalOvertime(double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public double getTotalOperational() {
        return totalOperational;
    }

    public void setTotalOperational(double totalOperational) {
        this.totalOperational = totalOperational;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public EmployeeType getStatus() {
        return status;
    }

    public void setStatus(EmployeeType status) {
        this.status = status;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", fullName='" + fullName + '\'' +
                ", hireDate=" + hireDate +
                ", status=" + status +
                ", salary=" + salary +
                ", totalSalary=" + totalSalary +
                ", totalInsurance=" + totalInsurance +
                ", totalOvertime=" + totalOvertime +
                ", totalTax=" + totalTax +
                ", totalOperational=" + totalOperational +
                '}';
    }
}
