class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int prof=0,max=0;
        int l=prices.length;
        for(int i=0;i<l;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            prof=prices[i]-min;

            if(prof>max)
            max=prof;
        

        }
        return max;
        
    }
}