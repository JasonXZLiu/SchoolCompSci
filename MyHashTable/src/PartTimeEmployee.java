/**
 * Created by jason_001 on 10/24/2017.
 */

// new class that extends the super class EmployeeInfo
public class PartTimeEmployee extends EmployeeInfo {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     * integer k represents number of buckets the buckets Array should have
     * uses polymorphism + overloading (two constructors with the same name)
     */

    // constructor with
    public PartTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, int workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weekPerYear) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weekPerYear;
    }

    // constructor with
    public PartTimeEmployee(int employeeNumber, String firstName, String lastName, String sex, String workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weekPerYear) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.weeksPerYear = weekPerYear;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* setters for th
     * because the attributes are private, must make methods to access
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setWeeksPerYear(double weeksPerYear) {
        this.weeksPerYear = weeksPerYear;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g.
     */

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
