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
    public int maxLevelSum(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        int l = 1;
        int maxl = 1;
        int max = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int s = q.size();
            int sum = 0;
            while(s-->0){
                TreeNode x = q.poll();
                sum += x.val;

                if(x.left != null){
                    q.add(x.left);
                }

                if(x.right != null){
                    q.add(x.right);
                }
            
            }
            
            if(sum > max){
                max = sum;
                maxl = l;
            }
            l++;
        }
        return maxl;
    }
}