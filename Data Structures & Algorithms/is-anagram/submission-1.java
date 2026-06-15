class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character,Integer> count = new HashMap<>();
      for(int i=0;i<s.length();i++){
        // if(count.containsKey(s.charAt(i))){
        //     count.put(s.charAt(i),(count.get(s.charAt(i))+1));
        // }else{
        //     count.put(s.charAt(i),1);
        // }
        count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
      }

      Map<Character,Integer> count2 = new HashMap();
      for(int i=0;i<t.length();i++){
        // if(count2.containsKey(t.charAt(i))){
        //    count2.put(t.charAt(i),(count2.get(t.charAt(i))+1));
        // }else{
        //     count2.put(t.charAt(i),1);
        // }
        count2.put(t.charAt(i),count2.getOrDefault(t.charAt(i),0)+1);
      }

      if(count.equals(count2)) return true;
      return false;
    }
}
