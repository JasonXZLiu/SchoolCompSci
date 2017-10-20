import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason_001 on 10/18/2017.
 */
public class EmployeeInfo {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private int sex; // encode e.g. 0 for M, 1 for F
    private int workLoc; // encode e.g. 0 for Mississauga
    private double deductRate; // e.g. 0.21 for 21%
    public static HashMap<String, Integer> encodeCities = new HashMap<>();
    public static ArrayList<String> cities = new ArrayList<>();

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

    public void display() {
        System.out.println("Employee Number: " + getEmployeeNumber());
        System.out.println(getFirstName() + " " + getLastName());
        System.out.println("Sex: " + getSex());
        System.out.println("Deduction Rate: " + getDeductRate());
        System.out.println();
    }

    public double calcIncome(int salary) {
        return Math.round((salary - deducted(salary)) * 100) / 100;
    }

    public double deducted(int salary) {
        return Math.round(salary * (getDeductRate()) * 100) / 100;
    }

    public int encodeWorkLoc(String s) {
        int i = encodeCities.size();
        if(cities.contains(s)) {
            return encodeCities.get(s);
        } else {
            encodeCities.put(s, i);
            cities.add(s);
            return encodeCities.size();
        }
    }
}