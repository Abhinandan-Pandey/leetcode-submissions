class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int compliment = target-nums[i];
            if(hash.containsKey(compliment)){
                int[] result =  {hash.get(compliment),i};
                return result;
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}
