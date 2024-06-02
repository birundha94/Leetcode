class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] twosum=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer> ();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                twosum[1]=i;
                twosum[0]= map.get(target-nums[i]);
                return twosum;
            }
            map.put(nums[i],i);
        }
        return twosum;
        
    }
}