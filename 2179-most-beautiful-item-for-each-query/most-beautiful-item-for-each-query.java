import java.util.Arrays;

public class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int[] result = new int[queries.length];
        int[][] queryWithIndex = new int[queries.length][2];
        
        for (int i = 0; i < queries.length; i++) {
            queryWithIndex[i][0] = queries[i];
            queryWithIndex[i][1] = i;
        }
        Arrays.sort(queryWithIndex, (a, b) -> a[0] - b[0]);

        int maxBeauty = 0;
        int j = 0;

        for (int[] query : queryWithIndex) {
            int queryValue = query[0];
            int queryIndex = query[1];

            while (j < items.length && items[j][0] <= queryValue) {
                maxBeauty = Math.max(maxBeauty, items[j][1]);
                j++;
            }
            result[queryIndex] = maxBeauty;
        }
        return result;
    }
}
