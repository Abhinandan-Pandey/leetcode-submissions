class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
          int current = 1; 
          for(int j=0; j<nums.length; j++){  
            if(i==j)continue;
            current *=nums[j];
          }
          System.out.print(current);
          res.add(current);
        }
                int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}  
