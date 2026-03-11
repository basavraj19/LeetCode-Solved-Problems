class Solution {
    public int[] twoSum(int[] a, int t) {
        int b[][] = new int[a.length][2];
		int ans[] = new int [2];
		for(int k=0;k<a.length;k++) {
		    b[k][0] = a[k];
		    b[k][1] = k;
		}
		
		Arrays.sort(b, (p,q) -> Integer.compare(p[0], q[0]));
		
		int i=0,j=a.length-1;
		
		while(i<j) {
		    int s = b[i][0]+b[j][0];
		    if(s==t) {
		        ans[0]= b[i][1];
                ans[1]= b[j][1];
		        break;
		    } else if(s>t) {
		        j--;
		    } else{
		        i++;
		    }
		}
        return ans;
    }
}