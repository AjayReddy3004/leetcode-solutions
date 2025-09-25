class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";

        int ans = 1;
        int start = 0;
        for(int i=0;i<n;i++){
            int p1=i,p2=i;
            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)){
                p1--;
                p2++;
            }
            int len = p2-p1-1;
            if(len>ans){
                ans = len;
                start = p1+1;
            }
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)){
                p1--;
                p2++;
            }
            len = p2-p1-1;
            if(len>ans){
                ans = len;
                start = p1+1;
            }
        }
        return s.substring(start,start+ans);
    }
}