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
    public int[] findMode(TreeNode root) {
         List<Integer> arr=new ArrayList<>();
         List<Integer> arr1=new ArrayList<>();
         HashMap<Integer,Integer> map=new HashMap<>();
         arr=inorder(root,arr);
        int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.size();i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            max=Math.max(map.get(arr.get(i)),max);
         }
         for(Map.Entry<Integer,Integer> m:map.entrySet()){
             if(m.getValue()==max){
                 arr1.add(m.getKey());
             }
         }
         int[] a = arr1.stream().mapToInt(i -> i).toArray();
         return a;
        
    }
    
    public List<Integer> inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return arr;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
}