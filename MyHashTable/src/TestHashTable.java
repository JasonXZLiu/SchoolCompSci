import java.util.Scanner;

public class TestHashTable {

    public static void main(String[] args) {
	    // write your code here
        MyHashTable m = new MyHashTable(2);

        FullTimeEmployee e = new FullTimeEmployee(2, "Jason", "Liu", "M", "Mississauga", 0.2, 100000);
        m.addEmployee(e);
        e = new FullTimeEmployee(4, "Alan", "Ma", "M", "Mississauga", 0.3, 100000);
        m.addEmployee(e);
        e = new FullTimeEmployee(1, "David", "Lu", "M", "Mississauga", 0.3, 100000);
        m.addEmployee(e);
        e = new FullTimeEmployee(7, "Mira", "Yadav", "F", "Mississauga", 0.3, 100000);
        m.addEmployee(e);
        PartTimeEmployee p = new PartTimeEmployee(5, "Daniel", "Niu", "M", "Mississauga", 0.5, 1000, 10, 10);
        m.addEmployee(p);
        e = new FullTimeEmployee(6, "William", "King", "M", "Mississauga", 0.3, 100000);
        m.addEmployee(e);
        p = new PartTimeEmployee(8, "Dhyey", "Bhavsar", "M", "Mississauga", 0.3, 1000, 10, 10);
        m.addEmployee(p);
        e = new FullTimeEmployee(3, "Kairui", "Cool kid", "F", "Mississauga", 0.3, 100000);
        m.addEmployee(e);

        m.displayContents();
        System.out.println();

        System.out.println("Search for: " + 3);
        System.out.println("FOUND AT " + m.searchByEmployeeNumber(3));
        System.out.println();

        System.out.println("Remove: 7");
        EmployeeInfo a = m.removeEmployee(7);
        a.display();

        m.displayContents();
    }
}
