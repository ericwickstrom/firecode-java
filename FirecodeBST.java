import java.util.*;
public class FirecodeBST {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {
        }

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean validateBST(TreeNode root) {
        if(root == null) return false;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        int prev = Integer.MIN_VALUE;
        TreeNode node = root;

        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while (!stack.isEmpty()) {
            node = stack.pop();
            
            if(node.data < prev) return false;
            prev = node.data;
            
            if (node.right != null) {
                node = node.right;
            
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }

        return true; 
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(5);
        TreeNode left = new TreeNode(2);
        left.right = new TreeNode(3);
        left.left = new TreeNode(1);
        root.left = left;

        System.out.println(true == validateBST(root));

        root = new TreeNode(5, new TreeNode(6), new TreeNode(7));
        System.out.println(false == validateBST(root));

        root = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        System.out.println(true == validateBST(root));

        root = new TreeNode(20);
        root.left = new TreeNode(15, null, new TreeNode(18));
        root.right = new TreeNode(30, null, new TreeNode(40));
        System.out.println(true == validateBST(root));

        root = new TreeNode(20, null, new TreeNode(40));
        root.left = new TreeNode(50, new TreeNode(10), new TreeNode(30));
    }   
}