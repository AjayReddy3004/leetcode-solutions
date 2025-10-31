class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] a = new int[2];
        int i = 0;
        for(int j :nums){
            if(hs.contains(j)){
                a[i++] = j;
            }else{
                hs.add(j);
            }
        }
        return a;
    }
}