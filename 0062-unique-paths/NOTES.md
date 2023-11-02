Optimal Approach :
TC : (n*m)
SC :  (n*m) as we are visting each index of array only once
`class Solution {
public int uniquePaths(int m, int n) {
int arr [][] =new int[m][n];``
int r= solve(m,n,0,0,arr);
return r;
}
public int solve(int m,int n,int r,int d,int arr[][]){
if(r==n-1&&d==m-1){
return 1;
}
if(r>=n||d>=m){
return 0;
}
if(arr[d][r]!=0){
return arr[d][r];
}
int p=solve(m,n,r+1,d,arr);
int q=solve(m,n,r,d+1,arr);
arr[d][r]=p+q;
return p+q;
}
}`