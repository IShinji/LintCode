/**
    770. Maximum and Minimum

    Given a matrix, return the maximum number and the minimum number.

    Example
    Example 1:

    Input : 
    [
    [1,2,3],
    [4,3,2],
    [6,4,4]
    ]
    Output : [6,1]
    Notice
    Your need to return a integer array, that array[0] represent the maximum and array[1] represent the minimum.
 */
public class Solution {
    /**
     * @param matrix: an input matrix 
     * @return: nums[0]: the maximum,nums[1]: the minimum
     */
    public int[] maxAndMin(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] res = new int[2];
        res[0] = Integer.MIN_VALUE;
        res[1] = Integer.MAX_VALUE;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[0] = Math.max(res[0], matrix[i][j]);
                res[1] = Math.min(res[1], matrix[i][j]);
            }
        }
        return res;
    }
}