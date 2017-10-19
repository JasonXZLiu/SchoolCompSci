/**
 * Created by jason_001 on 9/27/2017.
 */
public class StudentInfo {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */

    // student number of the student (used as index) as type int
    private int studentNum;
    // student's first name as type String
    private String firstName;
    // student's last name as type String
    private String lastName;
    // student's left child node as type StudentInfo
    // points to the next instance of StudentInfo along the left path
    // else would point to null
    private StudentInfo left;
    // student's right child node as type StudentInfo
    // points to the next instance of StudentInfo along the right path
    // else would point to null
    private StudentInfo right;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     * uses polymorphism + overloading (two constructors with the same name)
     */

    // instantiate StudentInfo with proper information
    // shouldn't be able to instantiate StudentInfo without required information
    public StudentInfo(int studentNum, String firstName, String lastName) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // constructor for all the fields (already has nodes)
    public StudentInfo(int studentNum, String firstName, String lastName, StudentInfo left, StudentInfo right) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.left = left;
        this.right = right;
        this.lastName = lastName;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* getter for the root position
     * because the attributes are private, must make methods to access/update
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
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
}
