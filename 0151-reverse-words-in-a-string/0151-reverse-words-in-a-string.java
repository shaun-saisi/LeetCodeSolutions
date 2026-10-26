class Solution {
    public String reverseWords(String s) {
        // 1. Split the string by one or more spaces "\\s+"
        // This automatically handles multiple spaces between words
        String[] words = s.trim().split("\\s+");
        
        // 2. Use a StringBuilder to efficiently build the result
        StringBuilder sb = new StringBuilder();
        
        // 3. Loop through the words array backwards
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" "); // Add a single space between words
            }
        }
        
        return sb.toString();
    }
}
