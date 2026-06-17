class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
       int len = 1;
       int curr=1;
       if(nums.length==0) return 0;
       for(int i=0;i<nums.length-1;i++){
         if(nums[i]==nums[i+1]) continue;
         if(nums[i]+1==nums[i+1]){
            curr++;
         }else{
             len= Math.max(curr, len);
             curr=1;
         }
       }
       return Math.max(curr, len);
    }
}
