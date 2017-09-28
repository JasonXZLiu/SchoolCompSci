/**
 * Created by jason_001 on 9/15/2017.
 */
public class MyLinkedList {
    private StudentInfo frontOfList;
    private int size;

    public StudentInfo getFrontOfList() {
        return frontOfList;
    }

    public int getSize() {
        return size;
    }


    public boolean addToRear(StudentInfo add) {
        if(this.getSize() == 0) {
            this.frontOfList = add;
            this.size++;
            return true;
        } else {
            int i = 0;
            StudentInfo s = frontOfList;
            this.size++;
            while(++i < this.size - 1) {
                s = s.getNext();
            }
            s.setNext(add);
            return true;
        }
    }

    public StudentInfo removeFromRear() {
        int i = 1;
        if(this.frontOfList != null) {
            StudentInfo s = frontOfList;
            while(++i < this.size - 1) {
                s = s.getNext();
            }
            StudentInfo removed = s;
            s.setNext(null);
            this.size--;
            return removed;
        }
        return null;
    }

    public StudentInfo removeFromFront() {
        if(this.frontOfList != null) {
            StudentInfo removed = this.frontOfList;
            this.frontOfList = removed.getNext();
            this.size--;
            return removed;
        }
        return null;
    }

    public boolean addToFront(StudentInfo add) {
        StudentInfo studentInfo = frontOfList;
        add.setNext(studentInfo);
        this.frontOfList = add;
        this.size++;
        return true;
    }

    public void studentsOutput() {
        StudentInfo someStudent = this.frontOfList;
        int i = 0;
        while (++i < this.size){
            someStudent.studentOutput(i);
            someStudent = someStudent.getNext();
        }
        if(someStudent != null) {
            someStudent.studentOutput(i);
            System.out.println();
        } else {
            System.out.println(0);
        }
    }
}
