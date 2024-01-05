class Solution {
    public int lengthOfLastWord(String s) {
         String trimmed = s.trim();

    
        String[] words = trimmed.split(" ");

       
        String lastWord = words[words.length - 1];
        return lastWord.length();
        
    }
}