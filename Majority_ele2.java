class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int l=nums.length;
        int y=(l/3)+1;
        for(int i=0;i<l;i++)
        {
            int value=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);

            if(mpp.get(nums[i])==y)
            list.add(nums[i]);

            // if(list.size()==l/3)
            // break;
        }
        return list;
        
    }
}