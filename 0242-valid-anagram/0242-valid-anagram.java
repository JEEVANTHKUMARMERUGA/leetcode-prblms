class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> jee = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i =0;i<s.length();i++){
            jee.put(s.charAt(i), jee.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j =0;j<t.length();j++){
        char c = t.charAt(j);
        if(!jee.containsKey(t.charAt(j))) return false;
        jee.put(c,jee.get(c)-1);
        if(jee.get(c)==0)  jee.remove(c);
        }
return jee.isEmpty();
    }
}