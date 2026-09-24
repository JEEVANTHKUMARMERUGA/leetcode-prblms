class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] apa = new int[2*nums.length];
        for(int i =0;i<nums.length;i++){
            apa[i] = nums[i];
            apa[i+nums.length] = nums[nums.length-i-1];
        }
        return apa;
    }
}