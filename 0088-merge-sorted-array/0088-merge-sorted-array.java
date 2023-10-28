class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        int gap=(int)Math.ceil((m+n)/2);
        int l=0,r=gap;
        while(gap>0){
            while(r<m+n){
                if(nums1[l]>nums1[r]){
                    int t=nums1[l];
                    nums1[l]=nums1[r];
                    nums1[r]=t;
                }
                l++;r++;
            }
            gap=(int)Math.ceil(gap/2);
            l=0;
            r=gap;
        }
        l=0;r=1;
        while(r<m+n){
                if(nums1[l]>nums1[r]){
                    int t=nums1[l];
                    nums1[l]=nums1[r];
                    nums1[r]=t;
                }
                l++;r++;
            }
        
    }
}