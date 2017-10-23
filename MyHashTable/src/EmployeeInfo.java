import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason_001 on 10/18/2017.
 */
public class EmployeeInfo {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */

    // employee number of type int to create a unique index / key for each employee
    private int employeeNumber;
    // employees first name of type String
    private String firstName;
    // employees last name of type String
    private String lastName;
    // employees sex of type int
    private int sex; // encode e.g. 0 for M, 1 for F
    // employees work location of type int
    // encoded based on the function encodeWorkLoc()
    private int workLoc; // encode e.g. 0 for Mississauga
    // employees deduction rate of type double
    private double deductRate; // e.g. 0.21 for 21%
    // map of each city name to an integer to map the encodings
    public static HashMap<String, Integer> encodeCities = new HashMap<>();
    // ArrayList of the cities (used to see if the work location has already been encoded)
    public static ArrayList<String> cities = new ArrayList<>();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     * integer k represents number of buckets the buckets Array should have
     * uses polymorphism + overloading (two constructors with the same name)
     */

    public EmployeeInfo(){}

    public EmployeeInfo(int employeeNumber, String firstName, String lastName, String sex, String workLoc, double deductRate) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        if(sex.equals("F")) {
            this.sex = 1;
        } else {
            this.sex = 0;
        }
        this.workLoc = encodeWorkLoc(workLoc);
        this.deductRate = deductRate;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* getter for the root position
     * because the attributes are private, must make methods to access
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getWorkLoc() {
        return workLoc;
    }

    public void setWorkLoc(int workLoc) {
        this.workLoc = workLoc;
    }

    public double getDeductRate() {
        return deductRate;
    }

    public void setDeductRate(double deductRate) {
        this.deductRate = deductRate / 100;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g. add a node, remove a node, display tree, etc.
     */

    // display method
    public void display() {
        System.out.println("Employee Number: " + getEmployeeNumber());
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("Sex: " + getSex());
        System.out.println("Deduction Rate: " + getDeductRate());
        System.out.println();
    }

    // display method
    public double calcIncome(int salary) {
        return Math.round((salary - deducted(salary)) * 100) / 100;
    }

    // display method
    public double deducted(int salary) {
        return Math.round(salary * (getDeductRate()) * 100) / 100;
    }

    // display method
    public int encodeWorkLoc(String s) {
        int i = encodeCities.size();
        if(cities.contains(s)) return encodeCities.get(s);
        else {
            encodeCities.put(s, i);
            cities.add(s);
            return encodeCities.size();
        }
    }
}