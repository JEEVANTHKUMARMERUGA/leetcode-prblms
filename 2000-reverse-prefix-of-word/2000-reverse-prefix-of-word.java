class Solution {
    public String reversePrefix(String word, char ch) {
      char[] arr = word.toCharArray();
      int index = word.indexOf(ch);
      if(index == -1) return word;
      int left = 0;
      int right = index;
      while(left<right){
        char te = arr[left];
        arr[left] = arr[right];
        arr[right] = te;

        left++;
        right--;
      }  
      return new String(arr);
    }
}