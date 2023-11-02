/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int result=0;
    public int averageOfSubtree(TreeNode root) {
         inorder(root);
        return result;
    }
    public int[] inorder(TreeNode root){
        if(root==null){
            return new int[] {0,0};
        }
        int left[]=inorder(root.left);
        int right[]=inorder(root.right);
        int sum = left[0]+right[0]+root.val;
        int count =left[1]+right[1]+1;
        if(sum/count==root.val) result++;
        return new int[]{sum,count};
    }
}