class Solution {
    public int lengthOfLastWord(String s) {
        // remove spaces from start and end
        s = s.trim();  
        
        // split the string by spaces
        String[] words = s.split(" ");  
        
        // get the last word
        String lastWord = words[words.length - 1];  
        
        // return its length
        return lastWord.length();  
    }
}

or 
    class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}
