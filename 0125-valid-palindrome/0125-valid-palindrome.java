class Solution {
    public boolean isPalindrome(String s) {
     /// tc  = o(n)
     String k = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
     int left  = 0;
     int right = k.length()-1;
     while(left<right){
             if(k.charAt(left)!=k.charAt(right)){
                return false;
             }
             left++;
             right--;
     }
     return true;
    }
}
