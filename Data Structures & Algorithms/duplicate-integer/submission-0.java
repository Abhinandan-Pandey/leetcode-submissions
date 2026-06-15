class Solution {
    public boolean hasDuplicate(int[] nums) {
        // System.out.print(nums[0]);
        // return true;
        Map<Integer,Boolean> hash = new HashMap();
        for(int i=0;i<nums.length;i++){
          if(hash.containsKey(nums[i])){
            return true;
          }else{
            hash.put(nums[i],false);
          }
        }
        return false;
    }
}
