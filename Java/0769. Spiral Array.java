/**
    769. Spiral Array

    Given an integer n, return a spiral array of n * n sizes.

    Example
    Example 1:

    Input : n = 3
    Output : 
    [
    [1,2,3]
    [8,9,4]
    [7,6,5]
    ]
    Example 2:

    Input : n = 5
    Output : 
    [
    [1,2,3,4,5]
    [16,17,18,19,6]
    [15,24,25,20,7]
    [14,23,22,21,8]
    [13,12,11,10,9]
    ]
 */
 public class Solution {
    /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public int[][] spiralArray(int n) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        int x = 0;
        int y = 0;
        int[][] res = new int[n][n];
        
        int nx = 0;
        int ny = 0;
        
        int d = 0;
        
        for(int i = 1; i <= n * n; i++) {
            res[x][y] = i;
            nx = x + dx[d];
            ny = y + dy[d];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || res[nx][ny] != 0) {
                d = (d + 1) % 4;
                nx = x + dx[d];
                ny = y + dy[d];
            }
            x = nx;
            y = ny;
        }
        return res;
    }
}