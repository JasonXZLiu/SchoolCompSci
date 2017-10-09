import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jason_001 on 9/27/2017.
 */
public class MyBinaryTree {
    // attributes
    private StudentInfo root;
    private int levels = -1;
    private int size = 0;

    // constructors
    // empty constructor
    public MyBinaryTree() {}

    public MyBinaryTree(int rootStudentNumber, String firstName, String lastName) {
        StudentInfo n = new StudentInfo(rootStudentNumber, firstName, lastName);
        this.root = n;
        this.levels++;
        this.size++;
    }

    // getter for the root position
    public StudentInfo getRoot() {
        return this.root;
    }

    // adds node to tree
    public void addToTree(StudentInfo root, StudentInfo n) {
        // checks if there is anything in the tree yet
        if(size == 0) {
            // if tree is empty, adds root
            this.root = n;
            this.levels++;
        } else {
            // instance of the root
            StudentInfo tmp = this.root;
            int i = 0;
            boolean b = true;
            // walk along the levels until get to the end
            while (i <= this.levels && b) {
                // check if number is greater or less than roots value
                if (n.getStudentNumber() > tmp.getStudentNumber()) {
                    // if reached end of the branch, add node
                    if (tmp.getRight() == null) {
                        n.setParent(tmp);
                        tmp.setRight(n);
                        b = false;
                    } else {
                        // haven't reached end so continue to next node
                        tmp = tmp.getRight();
                    }
                } else {
                    if (tmp.getLeft() == null) {
                        n.setParent(tmp);
                        tmp.setLeft(n);
                        b = false;
                    } else {
                        tmp = tmp.getLeft();
                    }
                }
            }
            // increment levels
            if (i > levels) {
                levels++;
            }
        }
        // increment size
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

    // inorder traversal using recursion
    public void inOrderTraversal(StudentInfo n) {
        // checks if node exists
        if(n != null) {
            // continue to next node on the left
            inOrderTraversal(n.getLeft());
            // process node
            System.out.println(n.getStudentNumber());
            // continue to next node on the right
            inOrderTraversal(n.getRight());
        }
        // returns back to where the function was called
    }

    public void preOrderTraversal(StudentInfo n) {
        if(n != null) {
            System.out.println(n.getStudentNumber());
            preOrderTraversal(n.getLeft());
            preOrderTraversal(n.getRight());
        }
    }

    public void postOrderTraversal(StudentInfo n) {
        if(n != null) {
            postOrderTraversal(n.getLeft());
            postOrderTraversal(n.getRight());
            System.out.println(n.getStudentNumber());
        }
    }
}
