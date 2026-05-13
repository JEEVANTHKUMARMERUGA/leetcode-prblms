class Solution {
    public int mirrorDistance(int n) {
        int sum =0;
        int real = n;
      while(n!=0){
         int r = n%10;
         sum = (sum*10)+r;
         n = n/10;
        } 
       return Math.abs(real-sum);
} }