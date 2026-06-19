class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int n = nums.length;
        // Set<List<Integer>> result = new HashSet<>();
        // for(int i=0;i<n-2; i++){
        //    for(int j=i+1;j<n-1;j++){
        //      for(int k =j+1;k<n;k++){
        //        if(nums[i]+nums[j]+nums[k]==0){
        //         List<Integer>triplet = Arrays.asList(nums[i],nums[j],nums[k]);
        //         Collections.sort(triplet);
        //         result.add(triplet);
        //        } 
        //      }
        //    }
        // }
        // return new ArrayList(result);

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
           int left = i+1;
           int right = nums.length-1;
          
            // System.out.printf(
            //     "i=%d, left=%d, right=%d, length=%d%n",
            //     i, left, right, nums.length
            // );

           while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            
            if(sum == 0){
                List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                res.add(triplet);
                left++;
                right--;

                   // Skip duplicates
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

            }else if(sum<0){
                left++;
            }else{
                right--;
            }
           }
        } 
        return res;
    }
}
