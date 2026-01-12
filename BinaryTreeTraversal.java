import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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

    public void breadthFirstSearch(BinaryTree tree){
        if(tree == null)
            return;

        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(tree);

        while(!queue.isEmpty()){
            BinaryTree current = queue.poll();

            System.out.print(current.val + "->");

            if(current.left != null){
                queue.add(current.left);
            }

            if(current.right != null){
                queue.add(current.right);
            }
        }
    }

        public void breadthZigZagOrder(BinaryTree root) {
        if (root == null) return;

        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                BinaryTree current = queue.poll();

                if (leftToRight) {
                    level.add(current.val);
                } else {
                    level.add(0, current.val); 
                }

                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }

            System.out.println(level);
            leftToRight = !leftToRight;
        }
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
        System.out.println("BreadthFirstSearch:");
        obj.breadthFirstSearch(tree);
        System.out.println();
        System.out.println("BreadthZigZagOrder:");
        obj.breadthZigZagOrder(tree);
        System.out.println();
    }
}
