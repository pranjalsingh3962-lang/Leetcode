class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int [] prefix_sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            prefix_sum[i]=sum;
        }
        return prefix_sum;
        
    }
}