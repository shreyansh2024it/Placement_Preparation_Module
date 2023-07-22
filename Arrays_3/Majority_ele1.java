class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        //int t=0;
        Arrays.sort(nums);
        int x=l/2;
        int y=nums[0];int count=0;

        for(int i=1;i<l;i++)
        {
            if(nums[i-1]==nums[i])
            count++;

            if(count>=x)
            {
                y=nums[i];
                break;
            }




        }
        return y;

        
    }
}