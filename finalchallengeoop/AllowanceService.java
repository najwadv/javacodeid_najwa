package finalchallengeoop;

import finalchallengeoop.tax.TaxSalary;

public interface AllowanceService extends TaxSalary {
    public void calcTotalSalary();
    public void calcTotalOvertime();
    public void calcTotalOperational();
    public void calcTotalInsurance();
    public void calcTax();
}
