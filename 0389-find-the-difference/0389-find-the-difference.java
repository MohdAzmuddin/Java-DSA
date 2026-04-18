class Solution {
    public char findTheDifference(String s, String t) {
     char arr1[] = s.toCharArray();
     char arr2[] = t.toCharArray();
     int sum=0;
     for(int i=0;i<arr2.length;i++){sum = sum+arr2[i];}
     for(int i=0;i<arr1.length;i++){sum = sum-arr1[i];}
     return (char)sum;
    }
}