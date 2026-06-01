class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                HashSet<Integer> apa = new HashSet<>();

        for(int i =0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   apa.add(nums1[i]);
                }
            }
        }
        int[] ans = new int[apa.size()];
        int k = 0;

        for(int num : apa) {
            ans[k++] = num;
        }

        return ans;
    }
}