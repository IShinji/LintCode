/**
 * Given an integer n, return the first n-line Yang Hui triangle.

    样例
    Example 1:

    Input : n = 4
    Output :  
    [
    [1]
    [1,1]
    [1,2,1]
    [1,3,3,1]
    ]
    注意事项
    1.0<=n<=20
    2.Yang Hui’s Triangle also called Pascal's triangle. --(Wikipedia)
 */

public class Solution {
    /**
     * @param n: a Integer
     * @return: the first n-line Yang Hui's triangle
     */
    public List<List<Integer>> calcYangHuisTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> item = new ArrayList<>();
            item.add(1);
            for(int j = 1; j < i; j++){
                int left = result.get(i - 1).get(j - 1);
                int right = result.get(i - 1).get(j);
                item.add(left + right);
            }
            if (n > 1 && i != 0) {
                item.add(1);
            }
            result.add(item);
        }
        return result;
    }
}
