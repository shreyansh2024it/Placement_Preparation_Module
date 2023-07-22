class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int l=nums.length;
        for(int i=1;i<l;i++)
        {
            if(nums[i-1]==nums[i])
            {
               c=nums[i]; 
            }

            
        }
        return c;
        
    }
}