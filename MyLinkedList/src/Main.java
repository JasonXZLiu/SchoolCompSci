public class Main {

    public static void main(String[] args) {
        // write your code here
        MyLinkedList theLL = new MyLinkedList();
        theLL.studentsOutput();

        StudentInfo someStudent;
        boolean addStatus;

        someStudent = new StudentInfo(123456, "Daffy", "Duck");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(888888, "Lola", "Bunny");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(555555, "Foghorn", "Leghorn");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(222222, "Marvin", "Martian");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(777777, "Bugs", "Bunny");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(111111, "Sylvester", "Cat");
        addStatus = theLL.addToFront(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(314, "Tweety", "Bird");
        addStatus = theLL.addToFront(someStudent);
        theLL.studentsOutput();



        StudentInfo removedItem;

        removedItem = theLL.removeFromFront();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();



        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromRear();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from rear of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();



        someStudent = new StudentInfo(123456, "Daffy", "Duck");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();

        someStudent = new StudentInfo(888888, "Lola", "Bunny");
        addStatus = theLL.addToRear(someStudent);
        theLL.studentsOutput();



        removedItem = theLL.removeFromFront();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromFront();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();

        removedItem = theLL.removeFromFront();
        if (removedItem != null) {
            System.out.println("\n\nRemoved " + removedItem.getFirstName() + " from front of the list!");
        }
        else {
            System.out.println("\n\nRemoval operation returned null, nothing removed from list because the list is empty!");
        }
        theLL.studentsOutput();
    }
}
