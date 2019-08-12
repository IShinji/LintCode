/**
    37. Reverse 3-digit Integer

    Reverse a 3-digit integer.

    Example
    Example 1:

    Input: number = 123
    Output: 321
    Example 2:

    Input: number = 900
    Output: 9
    Notice
    You may assume the given number is larger or equal to 100 but smaller than 1000.
 */
public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;
        return ge * 100 + shi * 10 + bai;
    }
}