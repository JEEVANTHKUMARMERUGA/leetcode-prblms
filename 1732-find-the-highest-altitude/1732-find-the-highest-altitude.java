class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0] = 0;
        for(int i =1;i<result.length;i++){
            result[i] = result[i-1]+gain[i-1];
        }
        Arrays.sort(result);
        return result[result.length-1];
    }
}