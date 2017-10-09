public class TestBinaryTree {

    public static void main(String[] args) {
        // instantiates an instance of MyBinaryTree
        MyBinaryTree theBinaryTree = new MyBinaryTree();
        // instantiates a new instance of StudentInfo
        StudentInfo randomStudent = new StudentInfo(7, "Mira", "Yadav");
        // adds node to the tree
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(11, "Catherine", "Lam");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(2, "Linda", "Zheng");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(5, "Grace", "Fan");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(20, "Dan", "Howell");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(16, "Phil", "Lester");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(9, "David", "Dobrik");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(12, "Jason", "Nash");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(1, "Liza", "Koshy");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        randomStudent = new StudentInfo(6, "Parita", "Yadav");
        theBinaryTree.addToTree(theBinaryTree.getRoot(), randomStudent);
        System.out.println("inOrderTraversal");
        theBinaryTree.inOrderTraversal(theBinaryTree.getRoot());
        System.out.println("preOrderTraversal");
        theBinaryTree.preOrderTraversal(theBinaryTree.getRoot());
        System.out.println("postOrderTraversal");
        theBinaryTree.postOrderTraversal(theBinaryTree.getRoot());
    }
}
