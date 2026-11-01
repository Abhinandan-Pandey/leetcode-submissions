class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    countSubstrings(s) {
        let res = 0;
        // for(let i = 0; i < s.length; i++){
        //   for(let j = i; j < s.length; j++){
        //      let l = i,
        //          r = j;
        //     while(l<r && s.charAt(l)===s.charAt(r)){
        //       l++;
        //       r--;
        //     }
        //     res +=l>=r?1:0;
        //   }
        // }

        //two pointers
        for (let i = 0; i < s.length; i++) {
            // odd length
            let l = i;
            let r = i;
            while (l >= 0 && r < s.length && s.charAt(l) === s.charAt(r)) {
                res++;
                l--;
                r++;
            }

            // even length
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length && s.charAt(l) === s.charAt(r)) {
                res++;
                l--;
                r++;
            }
        }

        //using DP
        // const n = s.length;
        // const dp = Array.from({ length: n }, () => Array(n).fill(false));
        // for (let i = n - 1; i >= 0; i--) {
        //     for (let j = i; j < n; j++) {
        //         if (s[i] === s[j] && (j - i <= 2 || dp[i + 1][j - 1])) {
        //             dp[i][j] = true;
        //             res++;
        //         }
        //     }
        // }

        return res;
    }
}
