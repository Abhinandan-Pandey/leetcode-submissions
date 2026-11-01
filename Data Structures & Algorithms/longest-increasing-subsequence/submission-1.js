class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    lengthOfLIS(nums) {
       const n = nums.length;
        const memo = Array.from({ length: n }, () => Array(n + 2).fill(-1));

        const dfs = (nums, i, j) => {
            if (i === nums.length) return 0;
            if(memo[i][j+1]!==-1)return memo[i][j+1];
            let LIS = dfs(nums, i + 1, j);

            if (j === -1 || nums[j] < nums[i]) {
                LIS = Math.max(LIS, 1 + dfs(nums, i + 1, i));
            }
            memo[i][j+1]=LIS;
            return LIS;
        };

        return dfs(nums, 0, -1);
    }
}
