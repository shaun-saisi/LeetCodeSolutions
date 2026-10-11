class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if a common divisor string is mathematically possible
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Find the GCD of the lengths of both strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the prefix of that length
        return str1.substring(0, gcdLength);
    }
    
    // Helper method to calculate GCD using the Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
