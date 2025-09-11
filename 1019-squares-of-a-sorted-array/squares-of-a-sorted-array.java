class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] b = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[i] = nums[i]*nums[i];
        }
        Arrays.sort(b);
        return b;
        
    }
}