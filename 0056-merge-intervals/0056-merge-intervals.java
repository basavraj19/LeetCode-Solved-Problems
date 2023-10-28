class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int s=intervals[0][0];
        int e=intervals[0][1];
    
         for(int a[]:intervals){
             if(a[0]<=e){
                 e=Math.max(e,a[1]);
             }else
             {
                 ans.add(new int[]{s,e});
                 s=a[0];
                 e=a[1];
             }
         }
        ans.add(new int[]{s,e});
        return ans.toArray(new int[0][]);
    }

}