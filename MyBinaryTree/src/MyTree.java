import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by jason_001 on 9/27/2017.
 */
public class MyTree {
    private MyNode root;
    private int levels = -1;

    public MyTree(int rootValue) {
        MyNode n = new MyNode(rootValue);
        this.root = n;
        this.levels++;
    }

    public MyNode getRoot() {
        return this.root;
    }

    public void addNode(int add) {
        MyNode n = new MyNode(add);
        MyNode tmp = this.root;
        int i = 0;
        boolean b = true;
        while(i <= this.levels && b) {
            if(n.getValue() > tmp.getValue()) {
                if(tmp.getRight() == null) {
                    n.setParent(tmp);
                    tmp.setRight(n);
                    b = false;
                } else {
                    tmp = tmp.getRight();
                }
            } else  {
                if (tmp.getLeft() == null) {
                    n.setParent(tmp);
                    tmp.setLeft(n);
                    b = false;
                } else {
                    tmp = tmp.getLeft();
                }
            }
        }
        if(i > levels) {
            levels++;
        }
    }

    public void traverseDFS() {
        Queue<MyNode> q = new LinkedList<>();
    }

    public int traverseBFS() {
        Stack<MyNode> s = new Stack<>();
        int cnt = 0;
        for(int i = 0; i < this.levels; i++) {
            cnt++;
        }
        return 0;
    }

    public MyNode inOrderTraversal(MyNode n) {
        System.out.println(n.getValue());
        if(n.getLeft() == null) return n;
        else inOrderTraversal(n.getLeft());
        if(n.getRight() == null) return n;
        else inOrderTraversal(n.getRight());
        return n;
    }
}
