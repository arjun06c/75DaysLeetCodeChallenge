class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int arr[]=new int[2];
        int left=0;
        int right=1;
        while(left<n)
        {
            if(nums[left]+nums[right]==target)
            {
                arr[0]=left;
                arr[1]=right;
                break;
            }
            if(right==n-1)
            {
                right=left+1;
                left++;
            }
            right++;
            
        }
        return arr;
    }
}