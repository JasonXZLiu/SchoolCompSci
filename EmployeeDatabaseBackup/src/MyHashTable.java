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
    private int size = 0;

    public MyHashTable(int k) {
        buckets = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    public int calcBucket(int tmp) {
        return tmp % buckets.length;
    }

    public int searchByEmployeeNumber(int tmp) {
        int tmp1 = calcBucket(tmp);
        for (int i = 0; i < buckets[tmp1].size(); i++) {
            if(buckets[tmp1].get(i).getEmpNumber() == tmp) {
                return i;
            }
        }
        return -1;
    }
    
     public boolean addEmployee(EmployeeInfo e) {
//        if(searchByEmployeeNumber(e.getEmpNumber()) == -1) {
            buckets[calcBucket(e.getEmpNumber())].add(e);
            size++;
            return true;
//        } else {
//            return false;
//        }
    }

    public EmployeeInfo removeEmployee(int employeeNum) {
        EmployeeInfo removed = null;
        int tmp1 = calcBucket(employeeNum);
        int i = searchByEmployeeNumber(employeeNum);
        if(buckets[tmp1].get(i).getEmpNumber() == employeeNum) {
            removed = buckets[tmp1].get(i);
            buckets[tmp1].remove(i);
        }
        size--;
        return removed;
    }

    public void displayContents() {
        System.out.println("EMPLOYEES: ");
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                buckets[i].get(j).display();
            }
        }
    }
    
    public int getSize() {
        return this.size;
    }
}
