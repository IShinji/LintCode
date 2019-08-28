/**
 * Reverse the given array nums inplace.

    样例
    Example 1:

    Input : nums = [1,2,5]
    Output : [5,2,1]
    注意事项
    Inplace means you can't use extra space.
 */
public class Solution {
    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            nums[start] += nums[end];
            nums[end] = nums[start] - nums[end];
            nums[start] = nums[start] - nums[end];
            start++;
            end--;
        }
    }
}
