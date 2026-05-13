class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> jee = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            jee.put(arr[i],jee.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> apa = new  HashSet<>();
        apa.addAll(jee.values());
        if(apa.size()==jee.size()){ return true;}
    return false;
    }

}