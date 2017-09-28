/**
 * Created by jason_001 on 9/25/2017.
 */
public class StudentInfo {
    private int studentNumber;
    private String firstName;
    private String lastName;
    private StudentInfo next;

    public StudentInfo(int studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentInfo getNext() {
        return next;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNext(StudentInfo next) {
        this.next = next;
    }

    public void studentOutput(int i) {
        System.out.println(i + ": " + this.studentNumber);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println();
    }
}
