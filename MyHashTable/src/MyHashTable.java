import java.util.ArrayList;

/**
 * Created by jason_001 on 10/18/2017.
 */
public class MyHashTable {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */

    // Array of ArrayList (of type EmployeeInfo) in order to store information
    // open storage, closed addressing
    private ArrayList<EmployeeInfo>[] buckets;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     * integer k represents number of buckets the buckets Array should have
     * uses polymorphism + overloading (two constructors with the same name)
     */

    // constructor with defined number of buckets
    public MyHashTable(int k) {
        // instantiate a new instance of buckets
        buckets = new ArrayList[k];
        // for loop to instantiate each ArrayList in the array buckets
        for (int i = 0; i < k; i++) {
            // instantiate new instance of ArrayList for each index in the array
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g. add a node, remove a node, display tree, etc.
     */

    // calcBucket
    // returns the bucket the Employee should go under by calculating the remainder of the employee number and the number of buckets
    public int calcBucket(int tmp) {
        return tmp % buckets.length;
    }

    /* searchEmployees
    * search through each of the employees in buckets to check if the employee exists
    * if the employee does exist, return the index of the employee in buckets
    * else, return -1 (signify the employee doesn't exist
    */
    public int searchByEmployeeNumber(int tmp) {
        int tmp1 = calcBucket(tmp);
        for (int i = 0; i < buckets[tmp1].size(); i++) {
            if(buckets[tmp1].get(i).getEmpNumber() == tmp) {
                return i;
            }
        }
        return -1;
    }

    /* addEmployee
     * see if the employee is already in the buckets by calling searchEmployees
     * if searchEmployees returns -1, know that employee doesn't exist in buckets
     * thus, adds the employee (after calling calBucket() to see which bucket the employee should be added to
     * else, if employee does exist, returns false
     */
     public boolean addEmployee(EmployeeInfo e) {
        if(searchByEmployeeNumber(e.getEmpNumber()) == -1) {
            buckets[calcBucket(e.getEmpNumber())].add(e);
            return true;
        } else {
            return false;
        }
    }

    /* removeEmployee
     * searches through each ArrayList of each bucket to find the employee
     * if the employee exists, than removes and returns the employee
     * else, returns null
     */
    public EmployeeInfo removeEmployee(int employeeNum) {
        System.out.println("REMOVED: ");
        EmployeeInfo removed = null;
        int tmp1 = calcBucket(employeeNum);
        int i = searchByEmployeeNumber(employeeNum);
        if(buckets[tmp1].get(i).getEmpNumber() == employeeNum) {
            removed = buckets[tmp1].get(i);
            buckets[tmp1].remove(i);
        }
        return removed;
    }

    /* displayContents
     * loops through each item of buckets and the ArrayList of each bucket
     * calls display to print the contents (in class EmployeeInfo)
     */
    public void displayContents() {
        System.out.println("EMPLOYEES: ");
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                buckets[i].get(j).display();
            }
        }
    }
}
