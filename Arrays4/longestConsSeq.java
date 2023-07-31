class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1,max=1;
         if(nums.length==0)
         return 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            continue;
           int diff=nums[i]-nums[i-1];
           if(diff==1)
           {
             count++;
            
           }
           else
           {
               max=Math.max(count,max);
               count=1;
           }
        }
        return Math.max(count,max);
        
    }
}
