class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] z = new boolean[n+1];

        for(int x:nums){
            if(x>0 && x<=n){
                z[x] = true;
            }
        }

        for(int i=1;i<=n;i++){
            if(!z[i]){
                return i;
            }
        }

        return n+1;
    }
}