/**
 * Created by jason_001 on 9/25/2017.
 */
public class MyQueue {
    private StudentInfo frontOfList;
    private int size;

    public MyQueue() {
        this.size = 0;
    }

    public StudentInfo getFrontOfList() {
        return frontOfList;
    }

    public void setFrontOfList(StudentInfo frontOfList) {
        this.frontOfList = frontOfList;
    }

    public void push(StudentInfo frontOfList) {
        if(this.size == 0) {
            this.frontOfList = frontOfList;
            this.size++;
        } else {
            frontOfList.setNext(this.frontOfList);
            this.frontOfList = frontOfList;
            this.size++;
        }
    }

    public StudentInfo pop() {
        if(this.size == 0) {
            return null;
        } else {
            this.size--;
            StudentInfo s = this.frontOfList;
            this.frontOfList = this.frontOfList.getNext();
            return s;
        }
    }

    public StudentInfo peek() {
        return frontOfList;
    }
}
