class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                // System.out.print(sub);
                if(containsAllCharacter(sub,t)){
                   if(sub.length()<minLength){
                     minLength=sub.length();
                     ans=sub;
                   }
                }
            }
        }
        return ans;
    }
    private boolean containsAllCharacter (String s, String t){
    Map<Character,Integer> have = new HashMap<>();
    Map<Character,Integer> need = new HashMap<>();   
    for(char c : s.toCharArray()){
      have.put(c,have.getOrDefault(c, 0)+1);
    }
    for(char c: t.toCharArray()){
      need.put(c,need.getOrDefault(c, 0)+1);
    }
    for(char c : need.keySet()){
      if(have.getOrDefault(c,0)<need.get(c)) return false;
    }
    return true;
}
}


