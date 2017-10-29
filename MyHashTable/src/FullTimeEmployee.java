/**
 * Created by jason_001 on 10/24/2017.
 */
public class FullTimeEmployee extends EmployeeInfo {
    private double yearlySalary;

    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, int workLoc, double deductRate, double yearlySalary) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
    }

    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, String sex, String workLoc, double deductRate, double yearlySalary) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double calcAnnualGrossIncome() {
        return(this.yearlySalary);
    }

    // display method
    public double calcAnnualNetIncome() {
        return calcAnnualGrossIncome() * (1-getDeductRate());
    }

    public void display() {
        System.out.println("Full Time Employee");
        System.out.println("Employee Number: " + getEmpNumber());
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("Sex: " + getSex());
        System.out.println("Deduction Rate: " + getDeductRate());
        System.out.println("Income: $" + calcAnnualNetIncome());
        System.out.println();
    }
}
