import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> jee = new HashMap<>();

        jee.put('I',1);
        jee.put('V',5);
        jee.put('X',10);
        jee.put('L',50);
        jee.put('C',100);
        jee.put('D',500);
        jee.put('M',1000); 

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            int current = jee.get(s.charAt(i));

            if(i < s.length()-1 && current < jee.get(s.charAt(i+1))) {
                count -= current;  
            } else {
                count += current;  
            }
        }

        return count;
    }
}
