class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        int l=nums.length;
        for(int i=1;i<=l;i++)
        {
            if(nums[i-1]==1)
            {
            c++;
            if(c>max)
            max=c;
            }
            else
            c=0;

        }

        return max;

        
    }
}