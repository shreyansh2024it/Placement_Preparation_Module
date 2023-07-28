class Solution {
    public int removeDuplicates(int[] nums) {


        int count=0;
        int l=nums.length;
        int j=0;
        for(int i=1;i<l;i++)
        {
            if(nums[i]!=nums[j])
            {
                j=j+1;
                nums[j]=nums[i];
            }
          

        }
        return j+1;

        
    }
}
