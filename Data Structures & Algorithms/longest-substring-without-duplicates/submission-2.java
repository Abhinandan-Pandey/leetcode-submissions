// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int k=0, maxLen=0;
//         Map<Character,Integer> hash = new HashMap<>();
//         for(int i =0;i<s.length();i++){
//            Character key= s.charAt(i);
//         //    if(hash.containsKey(key)){
//             while (hash.containsKey(key)) {
//                 hash.remove(s.charAt(k));
//                 k++;
//             }

//             hash.put(key, i);
//             maxLen = Math.max(maxLen, i - k + 1);
//         //    }else{
//              hash.put(key,i);
//         //    }
//         }
//         return maxLen;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}