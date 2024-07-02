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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList <Integer>li1=new ArrayList<>();
        ArrayList<Integer>li2=new ArrayList<>();
        traversal(root1,li1);
        traversal(root2,li2);
        if(li1.equals(li2)){
            return true;
        }else{
        return false;}
    }
    public static void traversal(TreeNode root,ArrayList<Integer>li){
        
        if(root==null){
         
            return;
        }

        
        if (root.left == null && root.right == null) {
            li.add(root.val);
        }
        
      
            traversal(root.left, li);
      
        
       
            traversal(root.right, li);
      
    }
}