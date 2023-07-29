class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr= new  ArrayList<>();
        int l=nums.length;
         
        Arrays.sort(nums);
        for(int i=0;i<l-2;i++)
        {
            if(i>0 && nums[i-1]==nums[i] )
            continue;

            int j=i+1;
            int k=l-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                j++;
                else if(sum>0)
                k--;
                else
                {
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    arr.add(temp);
                    while(j<k && nums[j]==nums[j+1])
                    j++;
                    while(j<k && nums[k]==nums[k-1])
                    k--;

                    j++;
                    k--;
                }
            }
        }
        return arr;
    }
}
