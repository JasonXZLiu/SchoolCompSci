/**
 * Created by jason_001 on 10/24/2017.
 */
public class PartTimeEmployee extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, int workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weekPerYear) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weekPerYear;
    }

    public PartTimeEmployee(int employeeNumber, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weekPerYear) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weekPerYear;
    }

    // display method
    public double deducted(double salary) {
        return Math.round(salary * (getDeductRate()) * 100) / 100;
    }


    public double calcAnnualGrossIncome() {
        return(this.hourlyWage*hoursPerWeek*weeksPerYear);
    }

    // display method

    public double calcAnnualNetIncome() {
        return calcAnnualGrossIncome() * (1-getDeductRate());
    }

    public void display() {
        System.out.println("Part Time Employee");
        System.out.println("Employee Number: " + getEmpNumber());
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("Sex: " + getSex());
        System.out.println("Deduction Rate: " + getDeductRate());
        System.out.println("Income: $" + calcAnnualNetIncome());
        System.out.println();
    }
}
