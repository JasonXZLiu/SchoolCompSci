import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner s = new Scanner(System.in);
        MyHashTable m = new MyHashTable(2);

        EmployeeInfo e = new EmployeeInfo(0, "Jason", "Liu", "M", "Mississauga", 0.2);
        m.addEmployees(e);
        e = new EmployeeInfo(4, "Alan", "Ma", "M", "Mississauga", 0.3);
        m.addEmployees(e);
        e = new EmployeeInfo(1, "David", "Lu", "M", "Mississauga", 0.3);
        m.addEmployees(e);
        e = new EmployeeInfo(3, "Mira", "Yadav", "F", "Mississauga", 0.3);
        m.addEmployees(e);

        m.displayContents();
        System.out.println();

        int i = s.nextInt();
        System.out.println("Search for: " + i);
        System.out.println("FOUND AT " + m.searchEmployees(i));
        System.out.println();

        System.out.print("Remove: ");
        int j = s.nextInt();
        e = m.removeEmployee(j);
        e.display();

        m.displayContents();
    }
}
