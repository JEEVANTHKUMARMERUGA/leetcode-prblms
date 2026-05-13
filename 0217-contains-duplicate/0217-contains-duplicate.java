class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> jee = new  HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(jee.contains(nums[i])){
                return true;
            }
            jee.add(nums[i]);
        }
return false;
    }
}