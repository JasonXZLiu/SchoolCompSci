import java.util.ArrayList;

/**
 * Created by jason_001 on 10/18/2017.
 */
public class MyHashTable {
    private ArrayList<EmployeeInfo>[] buckets;

    public MyHashTable(int k) {
        buckets = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    public int calcBucket(int tmp) {
        return tmp % buckets.length;
    }

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
