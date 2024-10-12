class Solution {
    public int minGroups(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int j = 0, count = 0;

        for (int i : starts) {
            if (i > ends[j]){
                j++;
            }
            else{
                count++;
            }
        }
        return count;
    }
}
