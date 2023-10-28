class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
       while(i<m&&j<n){
          if(nums1[i]>nums2[j]){
              int t=nums1[i];
              nums1[i]=nums2[j];
              nums2[j]=t;
              int k=1;
              while(k<n){
                  if(nums2[k-1]>nums2[k]){
                       t=nums2[k-1];
                      nums2[k-1]=nums2[k];
                      nums2[k]=t;
                      k++;
                  }else
                  {
                      break;
                  }
              }
          }
          i++;
       }
        
        j=0;
       for(i=m;i<m+n;i++){
           nums1[i]=nums2[j];
           j++;
       } 
    }
}