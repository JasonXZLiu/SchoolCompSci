public class Main {

    public static void main(String[] args) {
        // write your code here
        MyStack m = new MyStack();
        StudentInfo someStudent = new StudentInfo(123456, "Daffy", "Duck");
        m.push(someStudent);
        someStudent = new StudentInfo(888888, "Lola", "Bunny");
        m.push(someStudent);
        someStudent = m.peek();
        someStudent.studentOutput(0);
    }
}
