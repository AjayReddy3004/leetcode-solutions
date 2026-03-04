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
    public TreeNode insert(TreeNode root,int k){
        if(root == null){
            return new TreeNode(k);
        }
        if(k<root.val){
            root.left = insert(root.left,k);
        }else{
            root.right = insert(root.right,k);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i:preorder){
            root = insert(root,i);
        }
    return root;    
    }
}