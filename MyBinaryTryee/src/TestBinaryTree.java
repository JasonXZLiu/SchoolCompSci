public class TestBinaryTree {

    public static void main(String[] args) {
        // instantiates an instance of MyBinaryTree

        // instantiates new instances of StudentInfo
        MyBinaryTree theTree = new MyBinaryTree();
        StudentInfo someStudent = new StudentInfo(11, "first", "last");
        StudentInfo someStudent1 = new StudentInfo(16, "first", "last");
        StudentInfo someStudent2 = new StudentInfo(13, "first", "last");
        StudentInfo someStudent3 = new StudentInfo(5, "first", "last");
        StudentInfo someStudent4 = new StudentInfo(2, "first", "last");
        StudentInfo someStudent5 = new StudentInfo(14, "first", "last");
        StudentInfo someStudent6 = new StudentInfo(17, "first", "last");
        StudentInfo someStudent7 = new StudentInfo(1, "first", "last");
        StudentInfo someStudent8 = new StudentInfo(12, "first", "last");

        // adds node to the tree
        theTree.addToTree(theTree.getRoot(), someStudent);
        theTree.addToTree(theTree.getRoot(), someStudent1);
        theTree.addToTree(theTree.getRoot(), someStudent2);
        theTree.addToTree(theTree.getRoot(), someStudent3);
        theTree.addToTree(theTree.getRoot(), someStudent4);
        theTree.addToTree(theTree.getRoot(), someStudent5);
        theTree.addToTree(theTree.getRoot(), someStudent6);
        theTree.addToTree(theTree.getRoot(), someStudent7);
        theTree.addToTree(theTree.getRoot(), someStudent8);

        // call functions and displays output
        System.out.println("in order:");
        theTree.inorder(theTree.getRoot());
        System.out.println();
        System.out.println("preorder:");
        theTree.preorder(theTree.getRoot());
        System.out.println();
        System.out.println("postorder:");
        theTree.postorder(theTree.getRoot());
        System.out.println();
    }
}
