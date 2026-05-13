class Solution {
    public boolean checkIfPangram(String sentence) {
         HashMap<Character, Integer> jee = new HashMap<>();
          for(char ch = 'a'; ch <= 'z'; ch++) {
            jee.put(ch,0);
          }
          for(int i =0;i<sentence.length();i++){
            if(jee.containsKey(sentence.charAt(i))) jee.put(sentence.charAt(i),1);
          }
          for(int i:jee.values()){
            if(i==0) return false;
          }
          return true;
    }
}