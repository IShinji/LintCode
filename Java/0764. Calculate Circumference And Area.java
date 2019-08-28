/**
 * Given radius r, returns the circle's circumference nums[0] and area nums[1].The result retains two decimal places.

    样例
    Example 1:

    Input : r = 2
    Output : [12.56, 12.56]
    注意事项
    PI = 3.14
 */
public class Solution {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public double[] calculate(int r) {
        float PI = 3.14f;
        double []nums = new double[2];
        nums[0] = 2 * PI * r;
        nums[1] = PI * r * r;
        return nums;
    }
}
