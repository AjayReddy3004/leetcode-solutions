class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int p1=0,p2=n-1;
        int max = 0;
        while(p1<p2){
            int l = p2-p1;
            int h = Math.min(height[p1],height[p2]);
            int area = l*h;
                if(height[p1]<height[p2]){
                    p1++;
                }else{
                    p2--;
                }

            max = Math.max(max,area);
        }
        return max;
    }
}