class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;

        int ans = 1;
        for(int i=1;i<=x/2;i++){
            long s = (long)i*i;
            if(s == x) return i;
            if(s>x) return i-1;
            ans = i;
        }
        return ans;
        
    }
}