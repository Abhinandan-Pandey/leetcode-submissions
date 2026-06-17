class Solution {
    public int longestConsecutive(int[] nums) {
    //    Arrays.sort(nums);
    //    int len = 1;
    //    int curr=1;
    //    if(nums.length==0) return 0;
    //    for(int i=0;i<nums.length-1;i++){
    //      if(nums[i]==nums[i+1]) continue;
    //      if(nums[i]+1==nums[i+1]){
    //         curr++;
    //      }else{
    //          len= Math.max(curr, len);
    //          curr=1;
    //      }
    //    }
    //    return Math.max(curr, len);

        Set<Integer> set= new HashSet<>();
        for(int n:nums){
          set.add(n);
        }
        int ans = 0;
        for(int n: nums){
         if(!set.contains(n)) continue;
         int len = 0;
         int left=n,right=n+1;
         while(set.contains(left)){
               len++;
               set.remove(n);
               left--;
         }
         while(set.contains(right)){
            len++;
            set.remove(n);
            right++;
         }
         ans=Math.max(ans,len);
        }
        return ans;
    }
}
