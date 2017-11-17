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
    private int empNumber;
    // employees first name of type String
    private String firstName;
    // employees last name of type String
    private String lastName;
    // employees sex of type int
    private int sex; // encode e.g. 0 for M, 1 for F
    // employees work location of type int
    // encoded based on the function encodeWorkLoc()
    private int workLocation; // encode e.g. 0 for Mississauga
    // employees deduction rate of type double
    private double deductionRate; // e.g. 0.21 for 21%
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

    public EmployeeInfo(int empNumber, String firstName, String lastName, int sex, int workLocation, double deductionRate) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.workLocation = workLocation;
        this.deductionRate = deductionRate;
    }

    public EmployeeInfo(int empNumber, String firstName, String lastName, String sex, String workLocation, double deductionRate) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        if(sex.equals("F")) {
            this.sex = 1;
        } else {
            this.sex = 0;
        }
        this.workLocation = encodeWorkLoc(workLocation);
        this.deductionRate = deductionRate;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* getter for th
     * because the attributes are private, must make methods to access
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmployeeNumber(int empNumber) {
        this.empNumber = empNumber;
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
        return workLocation;
    }

    public void setWorkLoc(int workLocation) {
        this.workLocation = workLocation;
    }

    public double getDeductRate() {
        return deductionRate;
    }

    public void setDeductRate(double deductionRate) {
        this.deductionRate = deductionRate / 100;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g. add a node, remove a node, display tree, etc.
     */

    public void display(){};

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