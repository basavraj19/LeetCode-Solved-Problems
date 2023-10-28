class Solution {
    List<Integer> ans=new ArrayList<>();
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        solve(intervals);
        int res[][]=new int[ans.size()/2][2];
        int p=0;
        for(int i=0;i<ans.size();i++){
            res[p][0]=ans.get(i);
            i++;
            res[p][1]=ans.get(i);
            p++;
        }
        return res;
    }
    public void solve(int a[][]){
        for(int i=0;i<a.length-1;i++){
            if(((a[i+1][0]>=a[i][0])&&(a[i+1][0]<=a[i][1]))||((a[i+1][1]>=a[i][0])&&(a[i+1][1]<=a[i][1]))){
                a[i+1][0]=Math.min(a[i][0],a[i+1][0]);
                a[i+1][1]=Math.max(a[i][1],a[i+1][1]);
            }else
            {
                ans.add(a[i][0]);
                ans.add(a[i][1]);
            }
        }
        int i=a.length-1;
        if(((a[i][0]>=a[i-1][0])&&(a[i][0]<=a[i-1][1]))||((a[i][1]>=a[i-1][0])&&(a[i][1]<=a[i-1][1]))){
                ans.add(Math.min(a[i][0],a[i-1][0]));
                ans.add(Math.max(a[i][1],a[i-1][1]));
            }else
            {
                ans.add(a[i][0]);
                ans.add(a[i][1]);
            }
    }
}