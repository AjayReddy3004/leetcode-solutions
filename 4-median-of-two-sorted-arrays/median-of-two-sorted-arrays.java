class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] s = new int[n+m];
        int p1=0,p2=0,k=0;
        while(p1<n && p2<m){
            if(nums1[p1]<nums2[p2]){
                s[k++] = nums1[p1++];
            }else{
                s[k++] = nums2[p2++];
            }
        }
        while(p1<n){
            s[k++] = nums1[p1++];
        }
        while(p2<m){
            s[k++] = nums2[p2++];
        }

        int z = s.length;
        if(z%2 == 1 ){
            return s[z/2];
        }else{
            return (s[(z/2)-1]+s[z/2])/2.0;
        }
    }
}