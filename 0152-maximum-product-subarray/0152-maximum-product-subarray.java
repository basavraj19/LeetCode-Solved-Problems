class Solution {
    public int maxProduct(int[] nums) {
        int s=1,m=Integer.MIN_VALUE;
        int i=0,j=0;
        while(i<nums.length)
        {
            s*=nums[i];
            if(s>=m)
            {
                m=s;
            }
            if(s==0||i==nums.length-1)
            {
                j++;
                i=j-1;
                s=1;
            }
            i++;
        }
        
        return m;
    }
}