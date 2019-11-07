public class Main {
    public static void main(String [] args)
    {
        Binary_Tree myTree = new Binary_Tree();

        myTree.addNode(11, "Egor");
        myTree.addNode(27, "Igor");
        myTree.addNode(34, "Denis");
        myTree.addNode(88, "Maria");
        myTree.addNode(58, "Inessa");
        myTree.addNode(16, "Kirill");

        System.out.println("Inorder Traversal display of the Family Tree: ");
        myTree.inOrderTraversal(myTree.root);
        System.out.println();

        System.out.println("Find the Node with the key 11: ");
        System.out.println(myTree.findNode());
        System.out.println();

        System.out.println("Delete the Node with the key 11: ");
        System.out.println(myTree.deleteNode());
        System.out.println();

        System.out.println("Inorder Traversal display of the Family Tree after deletion: ");
        myTree.inOrderTraversal(myTree.root);
    }
}
