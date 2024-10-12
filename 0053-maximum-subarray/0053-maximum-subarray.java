class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cs=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            if(cs>0){
                cs+=nums[i];
            }
            else{
                cs=nums[i];
            }
            if(cs>maxsum){
                maxsum=cs;
            }
        }
        return maxsum;
        
    }
}