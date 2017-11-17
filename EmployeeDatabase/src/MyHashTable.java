import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
    protected ArrayList<EmployeeInfo>[] buckets;
    private int size = 0;
    private int k = 5;

    public MyHashTable(int k) {
        buckets = new ArrayList[k];
        for (int i = 0; i < k; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    public Object[][] getEmployees() {
        Object[][] tmp = new Object[this.size * this.k][10];
        int cnt = 0;
        for(int i = 0; i < this.k; i++) {
            if(buckets[i] != null){
                for(int j = 0; j < buckets[i].size(); j++) {
                    tmp[cnt] = buckets[i].get(j).toString().split(",");
                    cnt++;
                }
            }
        }
        return tmp;
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

    public void importData() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line = br.readLine();
        line = br.readLine();
        int cnt = 0;
        while(line != null) {
            String[] temp = line.split(",");
            if(temp[0].equals("P")) {
                PartTimeEmployee p = new PartTimeEmployee(temp);
                addEmployee(p);
            } else {
                FullTimeEmployee f = new FullTimeEmployee(temp);
                addEmployee(f);
            }
            cnt++;
            line = br.readLine();
        }   
        this.size = cnt;
    }
    
    public void exportData(){
        PrintWriter out = null;
        
        try{ 
            out = new PrintWriter(new BufferedWriter(new FileWriter("data.txt")));
            
            out.println("Type, Employee Number, First Name, LastName, Sex, Work Location, Deduction Rate, Hourly Wage, Hours Per Week, Weeks Per Year, Yearly Salary");
            
            for (int i = 0; i < buckets.length; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    out.println(buckets[i].get(j).toString());
                }
            }
            
        }catch(IOException e) {
            e.printStackTrace();
        } finally { 
	   try{
	      if(out != null)
		 out.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter");
	    }
	}
    }
    
    public int getSize() {
        return this.size;
    }
}
