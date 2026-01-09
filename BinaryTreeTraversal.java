public class BinaryTreeTraversal {

    public void preOrder(BinaryTree tree){
        if(tree == null)
            return;


        System.out.print(tree.val + "->");
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public void inOrder(BinaryTree tree){
        if(tree == null)
            return;

        inOrder(tree.left);
        System.out.print(tree.val + "->");
        inOrder(tree.right);
    }

    public void postOrder(BinaryTree tree){
        if(tree == null)
            return;

        postOrder(tree.left);
        postOrder(tree.right);
        System.out.print(tree.val + "->");
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);
        
        BinaryTreeTraversal obj = new BinaryTreeTraversal();

        System.out.println("PreOrder:");
        obj.preOrder(tree);
        System.out.println();
        System.out.println("InOrder:");
        obj.inOrder(tree);
        System.out.println();
        System.out.println("PostOrder:");
        obj.postOrder(tree);
        System.out.println();
    }
}
