class Solution {
    public int totalMoney(int n) {
        int t = 0;
        int ws = 1;
        
        for(int i =1;i<=n;i++){
            t += ws+(i-1)%7;
            if(i%7 == 0){
                ws++;
            }

        }
        return t;
        
    }
}