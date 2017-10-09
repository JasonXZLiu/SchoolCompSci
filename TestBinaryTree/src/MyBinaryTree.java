import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jason_001 on 9/27/2017.
 */
public class MyBinaryTree {
    private StudentInfo root;
    private int levels = -1;
    private int size = 0;

    public MyBinaryTree(StudentInfo n) {
        this.root = n;
        this.levels++;
        this.size++;
    }

    public StudentInfo getRoot() {
        return this.root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void addToTree(StudentInfo add) {
        StudentInfo tmp = this.root;
        int i = 0;
        boolean b = true;
        while(i <= this.levels && b) {
            if(add.getStudentNumber() > tmp.getStudentNumber()) {
                if(tmp.getRight() == null) {
                    tmp.setRight(add);
                    b = false;
                } else {
                    tmp = tmp.getRight();
                }
            } else  {
                if (tmp.getLeft() == null) {
                    tmp.setLeft(add);
                    b = false;
                } else {
                    tmp = tmp.getLeft();
                }
            }
        }
        if(i > levels) {
            levels++;
        }
        this.size++;
    }

    public void traverseDFS() {
        Queue<StudentInfo> q = new LinkedList<>();
    }

    public int traverseBFS() {
        Stack<StudentInfo> s = new Stack<>();
        int cnt = 0;
        for(int i = 0; i < this.levels; i++) {
            cnt++;
        }
        return 0;
    }

    public StudentInfo preOrder(StudentInfo n) {
        System.out.println(n.getStudentNumber());
        if(n.getLeft() == null) {
            if(n.getRight() == null)
                return n;
        } else preOrder(n.getLeft());
        if(n.getRight() == null) {
            if(n.getLeft() == null)
                return n;
        } else preOrder(n.getRight());
        return n;
    }

    public StudentInfo inOrder(StudentInfo n) {
        if(n.getLeft() == null) {
            System.out.println(n.getStudentNumber());
            if(n.getRight() == null) {
                return n;
            }
        } else inOrder(n.getLeft());
        if(n.getRight() == null) {
            System.out.println(n.getStudentNumber());
            if(n.getLeft() == null) {
                return n;
            }
        } else inOrder(n.getRight());
        return n;
    }

    public StudentInfo postOrder(StudentInfo n) {
        if(n.getLeft() == null) {
            if(n.getRight() == null) {
                return n;
            }
        } else postOrder(n.getLeft());
        System.out.println(n.getStudentNumber());
        if(n.getRight() == null) {
            if(n.getLeft() == null) {
                return n;
            }
        } else postOrder(n.getRight());
        System.out.println(n.getStudentNumber());
        return n;
    }
}
