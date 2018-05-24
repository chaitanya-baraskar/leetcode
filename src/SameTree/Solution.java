package SameTree;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traversal(p,q);
    }

    public boolean traversal (TreeNode p, TreeNode q){
        if(p==null && q==null){
            return false;
        }
        traversal(p.left, q.left);
        traversal(p.right, q.right);
        System.out.println("Node p --> " + p.val + " Node q --> " + q.val);
        if(p.val != q.val){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode p= new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(2);

        Solution solution = new Solution();

        System.out.println("Are tree same ---> " +  solution.isSameTree(p,q));

    }
}
