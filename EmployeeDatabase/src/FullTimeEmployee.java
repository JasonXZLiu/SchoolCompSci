/**
 * Created by jason_001 on 10/24/2017.
 */
// new class that extends the super class EmployeeInfo
public class FullTimeEmployee extends EmployeeInfo {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */
    private double yearlySalary;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     *
     */

    // constructor with
    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, int sex, String workLoc, double deductRate, double yearlySalary) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
    }
    
    public FullTimeEmployee(int employeeNumber, String firstName, String lastName, String sex, String workLoc, double deductRate, double yearlySalary) {
        super(employeeNumber, firstName, lastName, sex, workLoc, deductRate);
        this.yearlySalary = yearlySalary;
    }
    
    public FullTimeEmployee(String[] temp) {
        super(Integer.parseInt(temp[1]), temp[2], temp[3], temp[4], temp[5], Double.parseDouble(temp[6]));
        this.yearlySalary = Double.parseDouble(temp[10]);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* getter for th
     * because the attributes are private, must make methods to access
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g.
     */

    public double calcAnnualGrossIncome() {
        return(this.yearlySalary);
    }

    // display method
    public double calcAnnualNetIncome() {
        return calcAnnualGrossIncome() * (1-getDeductRate());
    }
    
    public Object[] getInfo() {
        Object[] tmp = new Object[10];
        return tmp;
    }

    public String toString() {
        String tmp = "";
        tmp += "F,";
        tmp += getEmpNumber() + ",";
        tmp += getFirstName() + ",";
        tmp += getLastName() + ",";
        tmp += decodeSex(getSex()) + ",";
        tmp += decodeWorkLoc(getWorkLoc()) + ",";
        tmp += getDeductRate() + ",";
        tmp += ",";
        tmp += ",";
        tmp += ",";
        tmp += this.yearlySalary;
        tmp += ",";
        return tmp;
    }
}
