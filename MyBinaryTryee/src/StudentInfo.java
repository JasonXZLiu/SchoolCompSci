/**
 * Created by jason_001 on 9/27/2017.
 */
public class StudentInfo {
    // attributes
    private int studentNumber;
    private String firstName;
    private String lastName;
    private StudentInfo parent;
    private StudentInfo left;
    private StudentInfo right;

    // constructors
    public StudentInfo(int studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentInfo(int studentNumber, String firstName, String lastName, StudentInfo left, StudentInfo right) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.left = left;
        this.right = right;
        this.lastName = lastName;
    }

    // getters and setters for private attributes
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public StudentInfo getLeft() {
        return left;
    }

    public void setLeft(StudentInfo left) {
        this.left = left;
    }

    public StudentInfo getRight() {
        return right;
    }

    public void setRight(StudentInfo right) {
        this.right = right;
    }

    public StudentInfo getParent() {
        return parent;
    }

    public void setParent(StudentInfo parent) {
        this.parent = parent;
    }
}
