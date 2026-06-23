class Solution {
    public int characterReplacement(String s, int k) {

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            Map<Character, Integer> freq = new HashMap<>();

            int maxFreq = 0;

            for (int j = i; j < s.length(); j++) {

                char c = s.charAt(j);

                freq.put(c, freq.getOrDefault(c, 0) + 1);

                maxFreq = Math.max(maxFreq, freq.get(c));

                int len = j - i + 1;

                if (len - maxFreq <= k) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}