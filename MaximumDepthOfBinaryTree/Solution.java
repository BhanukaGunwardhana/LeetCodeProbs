package MaximumDepthOfBinaryTree;
class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

class Solution {
    int largest;
    int count;
    int hold;
    public int maxDepth(TreeNode root) {
        if(root!=null){
            count++;
        }
        if(root ==null){return count;}
        TreeNode left=root.left;
        TreeNode right=root.right;

        if(left!=null){
            //count++;
            maxDepth(left);
        }

        if(right!=null){
            //count++;
            maxDepth(right);
        }
        if(largest<=count){
            largest=count;
            count--;
        }
        return largest;
    }
    
}
