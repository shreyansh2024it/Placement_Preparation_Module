class Solution {
    public int trap(int[] height) {
        int left=0;
        int res=0;
        int right=height.length-1;
        int leftMax=0,rightMax=0;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(leftMax<=height[left])
                leftMax=height[left];

                else
                res+=leftMax-height[left];

                left++;
            }
            else
            {
                if(rightMax<=height[right])
                rightMax=height[right];

                else
                res+=rightMax-height[right];

                right--;

            }
        }
        return res;

        
    }
}