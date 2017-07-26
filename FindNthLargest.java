import java.util.*;

public class FindNthLargest {
    public static class TreeNode {
        int data;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int data){
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }   
    
    public static TreeNode findKthLargest(TreeNode root, int k) {
        /*
        if(k > 1 && root != null){
            findKthLargest(root.right, k);
            
            
            System.out.println("r.data: " + root.data + " k: " + k);
            if(k == 1) return root; 
            k--;
            findKthLargest(root.left, k);
        }
        */
        /*
        Stack<TreeNode> stack = new Stack<>();
        
        while(root != null){
            stack.push(root);
            root = root.right;
        }
        while(!stack.isEmpty() && k > 0){
            k--;
            root = stack.pop();
            
            if(root.left != null){
                root = root.left;
                while(root != null){
                    stack.push(root);
                    root = root.left;
                }
            }
        }
        return root;
        */
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
         
        while (node != null) {
            stack.push(node);
            node = node.right;
        }
         
        while (stack.size() > 0) {

            k--;
            node = stack.pop();
            if(k == 0) return node;

            System.out.print(node.data + " ");
            if (node.left != null) {
                node = node.left;
                 
                while (node != null) {
                    stack.push(node);
                    node = node.right;
                }
          
            }        
        }

        return root;
    }

    public static void main(String[] args){
        int test1 = 8;
        TreeNode test1Tn = new TreeNode(4, new TreeNode(2), null);
        test1Tn.right = new TreeNode(8, new TreeNode(5), new TreeNode(10));
        TreeNode result = findKthLargest(test1Tn, 2);
        System.out.println("1 (" + test1 + "): " + result.data + " " + (test1 == result.data));
    }
}

