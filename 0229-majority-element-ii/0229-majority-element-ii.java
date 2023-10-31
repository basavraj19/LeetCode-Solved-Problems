class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int c1=0,c2=0,x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(x==0&&nums[i]!=c2){
                x++;
                c1=nums[i];
            }else if(y==0&&nums[i]!=c1){
                y++;
                c2=nums[i];
            }else if(nums[i]==c1){
                x++;
            }else if(nums[i]==c2){
                y++;
            }else
            {
                x--;
                y--;
            }
        }
        x=0;y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==c1) x++;
            else if(nums[i]==c2) y++;
        }
        if(x>nums.length/3) ans.add(c1);
        if(y>nums.length/3) ans.add(c2);
        
        return ans;
    }
}