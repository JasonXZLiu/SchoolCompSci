import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jason_001 on 9/27/2017.
 */

public class MyBinaryTree {

    /* attributes
     * private attributes to prevent unauthorized access / updates
     */

    // root node of the tree of type StudentInfo
    private StudentInfo root;
    // size of tree of type integer (initialized at 0)
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
                    // student number is greater than current node's student number
                    // if reached end of the branch, add node
                    if (tmp.getRight() == null) {
                        // sets the next node to be the one being added
                        tmp.setRight(n);
                        // breaks from the while loop
                        b = false;
                    } else {
                        // haven't reached end so continue to next node
                        tmp = tmp.getRight();
                    }
                } else {
                    // student number is smaller than current node's student number
                    // if next node is null, means reached the end of the branch
                    // because next is empty, can add the next one
                    if (tmp.getLeft() == null) {
                        // sets the next node to be the one being added
                        tmp.setLeft(n);
                        // breaks from the while loop
                        b = false;
                    } else {
                        // haven't reached end so continue to next node
                        tmp = tmp.getLeft();
                    }
                }
            }
        }
        // increment size
        this.size++;
    }

    /* inorder traversal
     * traversal using recursion
     * prints an order of the values from smallest to largest
     * checks left node, then processes node, then checks right node
     */
    public void inorder(StudentInfo n) {
        // checks if node exists (otherwise, would return nullPointerException)
        // if node exists, continues into if statement
        // else, reaches end of method so returns back to call
        if(n != null) {
            // recursively calls the method to traverse down next node
            // continue to next node on the left
            inorder(n.getLeft());
            // process node
            System.out.print(n.getStudentNum()+ " ");
            // recursively calls the method to traverse down next node
            // continue to next node on the right
            inorder(n.getRight());
        }
        // returns back to where the function was called
    }

    /* preorder traversal
     * traversal using recursion
     * prints the path of the nodes (going down the left branch until next is null, then checks right)
     * processes, then checks left node, then checks right node
     */
    public void preorder(StudentInfo n) {
        // checks if node exists (otherwise, would return nullPointerException)
        // if node exists, continues into if statement
        // else, reaches end of method so returns back to call
        if(n != null) {
            // process node
            System.out.print(n.getStudentNum() + " ");
            // recursively calls the method to traverse down next node
            // continue to next node on the left
            preorder(n.getLeft());
            // recursively calls the method to traverse down next node
            // continue to next node on the right
            preorder(n.getRight());
        }
        // returns back to where the function was called
    }

    /* postorder traversal
     * traversal using recursion
     * prints the path of the nodes (starts processing node when reaches end of branch -> works backwards)
     * checks left node, then checks right node, then processes
     */
    public void postorder(StudentInfo n) {
        // checks if node exists (otherwise, would return nullPointerException)
        // if node exists, continues into if statement
        // else, reaches end of method so returns back to call
        if(n != null) {
            // recursively calls the method to traverse down next node
            // continue to next node on the left
            postorder(n.getLeft());
            // recursively calls the method to traverse down next node
            // continue to next node on the right
            postorder(n.getRight());
            // process node
            System.out.print(n.getStudentNum() + " ");
        }
    }
}
