class Solution {
    public int digit(int n){
        int cnt = 0;
        while(n != 0){
            n /=2;
            cnt++;
        }
        return cnt;
    }
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int x = digit(n);
        int ans = n^((1<<x)-1);
        return ans;
    }
}