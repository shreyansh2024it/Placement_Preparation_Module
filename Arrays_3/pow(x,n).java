class Solution {
    public double myPow(double x, int n) {
        double y=1.0;
        //double z=0;
        long a=n;
        if(a<0)
        a*=(-1);

        while(a>0)
        {
            if(a%2==0)
            {
                x*=x;
                a/=2;

            }
            else
            {
                y*=x;
                a=a-1;

            }

        }
        if (n < 0) 
        y = (double)(1.0) / (double)(y);
        return y;
    
        
    }
}