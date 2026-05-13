class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> apa = new ArrayList<>();
        int sum =0;
        for(int i = 0;i<nums.length;i++)
        {
         List<Integer> temp = new ArrayList<>();

            while(nums[i]!=0){
                int r = nums[i]%10;
                temp.add(r);
                nums[i]=nums[i]/10;
            }
            for(int j = temp.size() - 1; j >= 0; j--) {
                apa.add(temp.get(j));
            }
        }
        
        int[] jeevanth = new int[apa.size()];
        for(int j =0;j<apa.size();j++){
            jeevanth[j]=apa.get(j);
        }
        return jeevanth;
        
    }
}