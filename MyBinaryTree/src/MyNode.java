/**
 * Created by jason_001 on 9/27/2017.
 */
public class MyNode {
    private int value;
    private MyNode parent;
    private MyNode left;
    private MyNode right;

    public MyNode(int value) {
        this.value = value;
    }

    public MyNode(int value, MyNode left, MyNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public MyNode getParent() {
        return parent;
    }

    public void setParent(MyNode parent) {
        this.parent = parent;
    }
}
