public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList m = new MyLinkedList();
        StudentInfo someStudent = new StudentInfo(123456, "Daffy", "Duck");
        System.out.println(m.addToRear(someStudent));
        someStudent = new StudentInfo(888888, "Lola", "Bunny");
        System.out.println(m.addToRear(someStudent));
        m.studentsOutput();
    }
}
