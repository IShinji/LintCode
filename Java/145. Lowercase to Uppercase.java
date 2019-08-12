/**
    145. Lowercase to Uppercase

    Convert a lowercase character to uppercase.

    Example
    Example 1:

    Input: 'a'
    Output: 'A'
    Example 2:

    Input: 'b'
    Output: 'B'
 */
public class Solution {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        return (char)(character + 'A' - 'a');
    }
}