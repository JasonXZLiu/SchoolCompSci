import java.util.Scanner;

public class TestBinaryTree {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        StudentInfo root = new StudentInfo(s.nextInt(), s.next(), s.next());
        MyBinaryTree t = new MyBinaryTree(root);
        boolean b = true;
        while(b) {
            String a = s.next();
            if(!a.equals("N")) {
                String fN = s.next();
                String lN = s.next();
                StudentInfo tmp = new StudentInfo(Integer.parseInt(a), fN, lN);
                t.addToTree(tmp);
            } else {
                b = false;
            }
        }
        // need to fix
        System.out.println("InorderTraversal");
        t.inOrder(t.getRoot());
        System.out.println("PreorderTraversal");
        t.preOrder(t.getRoot());
        System.out.println("PostorderTraversal");
        t.postOrder(t.getRoot());
    }
}
