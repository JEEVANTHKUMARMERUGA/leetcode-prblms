class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       HashMap <Integer,Integer> jee = new  HashMap<>();
       for(int i =0;i<nums.length;i++){
        jee.put(nums[i],jee.getOrDefault(nums[i],0)+1);
       }
       int ans[] = new int[2];
       int index = 0;
       for(int i =0;i<nums.length;i++){
        if(jee.get(nums[i])==2) {
            ans[index++] = nums[i];
            jee.put(nums[i],0);
        }
       }
       return ans;
    }
}