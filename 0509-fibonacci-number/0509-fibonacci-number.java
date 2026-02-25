class Solution {
    public int fib(int n) {
        int a[] = new int[n+1];
        return solve(n, a);
    }

    public int solve(int n, int[]a) {
        if(n==0 || n==1) return n;
        if(a[n] !=0) return a[n];
        
        a[n] = solve(n-1,a) + solve(n-2, a);
        return a[n];
    }
}