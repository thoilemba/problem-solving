package leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference for comparison
        String firstString = strs[0];
        StringBuilder commonPrefix = new StringBuilder();
        
        // Find the common prefix character by character
        for (int i = 0; i < firstString.length(); i++) {
            char currentChar = firstString.charAt(i);

            // Check if the current character is common to all strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }

            // If the character is common to all strings, append to the common prefix
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String[] example1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(example1));  // Output: "fl"
        
        String[] example2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(example2));  // Output: ""
        
        String[] example3 = {"abcd", "a", "abcd"};
        System.out.println(longestCommonPrefix(example3)); 
    }
    
    /* 
       Try the example3 with this condition.
       if(i > strs[j].length() || strs[j].charAt(i) != currentChar) {
    		return commonPrefix.toString();
       }
       
       In "i >= strs[j].length()", '>=' is required,
       otherwise it will cause indexOutOfBound exception
    */
}

