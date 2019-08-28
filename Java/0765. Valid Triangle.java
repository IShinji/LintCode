/**
 * Given three integers a, b, c, return true if they can form a triangle.

    样例
    Example 1:

    Input : a = 2, b = 3, c = 4
    Output : true
    Example 2:

    Input : a = 1, b = 2, c = 3
    Output : false
    注意事项
    What is Triangle? (Wikipedia)
 */
public class Solution {
    /**
     * @param a: a integer represent the length of one edge
     * @param b: a integer represent the length of one edge
     * @param c: a integer represent the length of one edge
     * @return: whether three edges can form a triangle
     */
    public boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }
}