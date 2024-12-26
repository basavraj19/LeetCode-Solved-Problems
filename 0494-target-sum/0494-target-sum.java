class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    
    public int solve(int a[], int t, int i, int sum){
        if(i>=a.length){
            if(sum==t){
                return 1;
            }
            return 0;
        }
        
        return solve(a,t,i+1,sum+a[i]) + solve(a,t,i+1,sum-a[i]);
    }
}