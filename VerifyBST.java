import java.util.LinkedList;
public class VerifyBST {
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

    public static class VerifyTreeNode{
        public int max;
        public int min;
        public TreeNode treeNode;

        public VerifyTreeNode(TreeNode n, int max, int min){
            this.treeNode = n;
            this.max = max;
            this.min = min;
        }
    }

    public static boolean verify(TreeNode root){
        if(root == null) return true;
        LinkedList<VerifyTreeNode> q = new LinkedList<>();
        q.add(new VerifyTreeNode(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
        
        while(!q.isEmpty()){
            VerifyTreeNode n = q.remove();
            if(n.treeNode.data > n.max || n.treeNode.data < n.min) return false;
            if(n.treeNode.left != null){
                q.add(new VerifyTreeNode(n.treeNode.left, n.treeNode.data, n.min));
            }
            if(n.treeNode.right != null){
                q.add(new VerifyTreeNode(n.treeNode.right, n.max, n.treeNode.data));
            }
            
        }

        return true;
    }  

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean t1r = false;

        TreeNode t2 = new TreeNode(20, new TreeNode(15), new TreeNode(40));
        t2.left.left = new TreeNode(10);
        t2.left.right = new TreeNode(30);
        boolean t2r = false;

        TreeNode t3 = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        boolean t3r = true;

        TreeNode t4 = new TreeNode(20, new TreeNode(15), new TreeNode(30));
        t4.left.right = new TreeNode(18);
        t4.right.right = new TreeNode(40);
        boolean t4r = true;

        TreeNode nullTn = null;
        boolean nullTnr = true;
        
        System.out.println("nl: " + (nullTnr == verify(nullTn)));
        System.out.println("t1: " + (t1r == verify(t1)));
        System.out.println("t2: " + (t2r == verify(t2)));
        System.out.println("t3: " + (t3r == verify(t3)));
        System.out.println("t4: " + (t4r == verify(t4)));
        
        
        
    }  
}