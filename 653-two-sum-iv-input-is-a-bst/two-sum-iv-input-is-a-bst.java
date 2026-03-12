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
    List<Integer> ls = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int l = 0;
        int r = ls.size()-1;
        while(l<r){
            int sum = ls.get(l)+ls.get(r);
            if(sum == k){
                return true;
            }
            else if(sum<k){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ls.add(root.val);
        inorder(root.right);
    }
}