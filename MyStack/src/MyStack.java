/**
 * Created by jason_001 on 9/25/2017.
 */
public class MyStack {
    private StudentInfo frontOfList;
    private StudentInfo rearOfList;
    private int size;

    public MyStack() {
        this.size = 0;
    }

    public StudentInfo getFrontOfList() {
        return frontOfList;
    }

    public void setFrontOfList(StudentInfo frontOfList) {
        this.frontOfList = frontOfList;
    }

    public StudentInfo getRearOfList() {
        return rearOfList;
    }

    public void setRearOfList(StudentInfo rearOfList) {
        this.rearOfList = rearOfList;
    }

    public void push(StudentInfo add) {
        if(this.size == 0) {
            this.frontOfList = add;
            this.rearOfList = add;
            this.size++;
        } else {
            rearOfList.setNext(add);
            this.frontOfList = add;
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
        return rearOfList;
    }
}
