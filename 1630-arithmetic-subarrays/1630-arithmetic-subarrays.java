class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ans.add(isArithmetic(nums,l[i],r[i]));
        }
        return ans;
    }
    public boolean isArithmetic(int a[],int i,int j){
        int b[]=new int[j-i+1];
        int ind=0;
        for(int k=i;k<=j;k++){
            b[ind++]=a[k];
        }
        Arrays.sort(b);
        int s=b[1]-b[0];
        for(i=2;i<b.length;i++){
            if(b[i]-b[i-1]!=s){
                return false;
            }
        }
        return true;
    }
}