class Solution {
    public int[] productExceptSelf(int[] nums) {
        // List<Integer> res = new ArrayList<>();
        // for(int i=0; i<nums.length; i++){
        //   int current = 1; 
        //   for(int j=0; j<nums.length; j++){  
        //     if(i==j)continue;
        //     current *=nums[j];
        //   }
        //   System.out.print(current);
        //   res.add(current);
        // }
        // int[] result = new int[res.size()];
        // for (int i = 0; i < res.size(); i++) {
        //     result[i] = res.get(i);
        // }
        // return result;

        int n = nums.length;
        int[] res = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1;
        suf[n-1] = 1;

        for(int i=1;i<n;i++){
          pre[i]=pre[i-1]*nums[i-1];
          suf[n-1-i]=suf[n-i]*nums[n-i];
        }

        for(int i=0;i<n;i++){
            res[i]=pre[i]*suf[i];
        }
        return res;
    }
}  
