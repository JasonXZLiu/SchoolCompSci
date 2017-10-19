import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jason_001 on 9/27/2017.
 */
public class MyBinaryTree {
    // attributes
    // root node of the tree
    private StudentInfo root;
    // size of tree
    private int size = 0;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* constructors
     * use to instantiate a new instance of the class
     * creates a new object based on the passed parameters
     * uses polymorphism + overloading (two constructors with the same name)
     */

    // empty constructor
    public MyBinaryTree() {}

    // constructor with defined root
    public MyBinaryTree(int rootStudentNumber, String firstName, String lastName) {
        StudentInfo n = new StudentInfo(rootStudentNumber, firstName, lastName);
        this.root = n;
        this.size++;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* getter for the root position
     * because the attributes are private, must make methods to access
     * getter returns the value of the attribute
     * setter sets a new value for the attribute
     */

    // getter for the root node
    // once called, passes the instance of StudentInfo back
    public StudentInfo getRoot() {
        return this.root;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* methods
     * procedures that are specific to the class
     * e.g. add a node, remove a node, display tree, etc.
     */

    /* addToTree
     * adds node to tree by iterating through (walking down) the branches
     * compares the values of studentNum to decide whether to go left or right
     * if bigger than current node, will go to the right
     * if less than current node, will move to left
     * continues until finds the node's children to be null
     */
    public void addToTree(StudentInfo root, StudentInfo n) {
        // checks if there is anything in the tree yet
        if(size == 0) {
            // if tree is empty, adds root
            this.root = n;
        } else {
            // instance of the root
            StudentInfo tmp = this.root;
            int i = 0;
            boolean b = true;
            // walk along the nodes until get to the end
            while (b) {
                // check if number is greater or less than roots value
                if (n.getStudentNum() > tmp.getStudentNum()) {
                    // if reached end of the branch, add node
                    if (tmp.getRight() == null) {
                        tmp.setRight(n);
                        b = false;
                    } else {
                        // haven't reached end so continue to next node
                        tmp = tmp.getRight();
                    }
                } else {
                    if (tmp.getLeft() == null) {
                        tmp.setLeft(n);
                        b = false;
                    } else {
                        tmp = tmp.getLeft();
                    }
                }
            }
        }
        // increment size
        this.size++;
    }

    // inorder traversal using recursion
    // prints an order of the values from smallest to largest
    public void inorder(StudentInfo n) {
        // checks if node exists
        if(n != null) {
            // continue to next node on the left
            inorder(n.getLeft());
            // process node
            System.out.print(n.getStudentNum()+ " ");
            // continue to next node on the right
            inorder(n.getRight());
        }
        // returns back to where the function was called
    }

    // preorder traversal using recursion
    // prints the path of the nodes
    public void preorder(StudentInfo n) {
        if(n != null) {
            System.out.print(n.getStudentNum() + " ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

    // postorder traversal using recursion
    public void postorder(StudentInfo n) {
        if(n != null) {
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.print(n.getStudentNum() + " ");
        }
    }
}
