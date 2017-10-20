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

    /* addToTree
     * adds node to tree by iterating through (walking down) the branches
     * compares the values of studentNum to decide whether to go left or right
     * if bigger than current node, will go to the right
     * if less than current node, will move to left
     * continues until finds the node's children to be null
     */
     public boolean addEmployees(EmployeeInfo e) {
        if(searchEmployees(e.getEmployeeNumber()) == -1) {
            buckets[calcBucket(e.getEmployeeNumber())].add(e);
            return true;
        } else {
            return false;
        }
    }

    public EmployeeInfo removeEmployee(int employeeNum) {
        System.out.println("REMOVED: ");
        EmployeeInfo e = null;
        int tmp1 = calcBucket(employeeNum);
        for (int i = 0; i < buckets[tmp1].size(); i++) {
            if(buckets[tmp1].get(i).getEmployeeNumber() == employeeNum) {
                e = buckets[tmp1].get(i);
                buckets[tmp1].remove(i);
                return e;
            }
        }
        return e;
    }

    public void displayContents() {
        System.out.println("EMPLOYEES: ");
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                buckets[i].get(j).display();
            }
        }
    }

    public int calcBucket(int tmp) {
        return tmp % buckets.length;
    }

    public int searchEmployees(int tmp) {
        int tmp1 = calcBucket(tmp);
        for (int i = 0; i < buckets[tmp1].size(); i++) {
            if(buckets[tmp1].get(i).getEmployeeNumber() == tmp) {
                return i;
            }
        }
        return -1;
    }
}
