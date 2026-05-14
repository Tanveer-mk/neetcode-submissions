class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res = new int[m+n];
       int k = 0;
       int l = 0;
       int r = 0;
       while(l < m && r < n){
            if(nums1[l] < nums2[r]){
                res[k] = nums1[l];
                k++;
                l++;
            }else{
                res[k] = nums2[r];
                k++;
                r++;
            }
       } 
       while(l < m){
            res[k] = nums1[l];
            l++;
            k++; 
       }
       while(r < n){
            res[k] = nums2[r];
            r++;
            k++; 
       }
       for(int i = 0; i<nums1.length; i++){
            nums1[i] = res[i];
       }
       
    }
}