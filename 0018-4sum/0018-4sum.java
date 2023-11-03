class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i>0&&a[i]==a[i-1]){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(j>i+1&&a[j]==a[j-1]) continue;
                int k=j+1,l=a.length-1;
                while(k<l){
                    long s=(long)a[i]+a[j]+a[k]+a[l];
                    if(s==(long)target){
                        ans.add(Arrays.asList(a[i],a[j],a[k],a[l]));  
                        while(k<l&&a[k]==a[k+1]){
                            k++;
                        }
                        while(l>k&&a[l]==a[l-1]){
                            l--;
                        }
                        k++;
                        l--;
                    }else if(s>target){
                        l--;
                    }else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}