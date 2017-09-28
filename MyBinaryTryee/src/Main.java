import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        MyTree t = new MyTree(s.nextInt());
        boolean b = true;
        while(b) {
            String a = s.next();
            if(!a.equals("N")) {
                t.addNode(Integer.parseInt(a));
            } else {
                b = false;
            }
        }
        t.inOrderTraversal(t.getRoot());
    }
}
