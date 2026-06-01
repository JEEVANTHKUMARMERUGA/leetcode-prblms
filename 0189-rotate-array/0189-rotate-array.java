class Solution {
    public void rotate(int[] nums, int k) {
      int[] arr = new int[nums.length];
      int index = 0;
      k = k % nums.length;
      for(int i = nums.length-k;i<nums.length;i++){
        arr[index]=nums[i];
        index++;
      } 
     for(int i =k;i<nums.length;i++){
        arr[i]=nums[i-k];
     }
     for(int i = 0; i < nums.length; i++) {
    nums[i] = arr[i];
}
     System.out.println(Arrays.toString(nums));
    }
}