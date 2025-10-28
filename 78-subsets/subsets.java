class Solution {
    private boolean CheckBit(int i,int j){
        return ((i & (1<<j)) != 0);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<(1<<n);i++){
            List<Integer> s = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(CheckBit(i,j) == true){
                    s.add(nums[j]);
                }
            }
            res.add(s);
        }
        return res;
    }
}