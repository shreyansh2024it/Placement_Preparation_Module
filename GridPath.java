class Solution {
    public int uniquePaths(int m, int n) {
        int maxDown=Math.min(m-1,n-1);
        
        int maxPath=m+n-2;
        double ans1=1;
        for(double i=1;i<=maxDown;i++)
        {
            ans1*=(maxPath-i+1);
            ans1/=i;
        }
        

        return (int)ans1;

    }     
}