class Solution {
    public int lengthOfLongestSubstring(String s) {
        int k=0, maxLen=0;
        Map<Character,Integer> hash = new HashMap<>();
        for(int i =0;i<s.length();i++){
           Character key= s.charAt(i);
        //    if(hash.containsKey(key)){
            while (hash.containsKey(key)) {
                hash.remove(s.charAt(k));
                k++;
            }

            hash.put(key, i);
            maxLen = Math.max(maxLen, i - k + 1);
        //    }else{
             hash.put(key,i);
        //    }
        }
        return maxLen;
    }
}
