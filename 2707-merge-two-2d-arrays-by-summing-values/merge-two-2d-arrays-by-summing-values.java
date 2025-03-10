class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int[] num : nums1){
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }

        for(int[] num : nums2){
            map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        }

        List<int[]> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }

        result.sort((a, b) -> a[0] - b[0]);

        return result.toArray(new int[result.size()][]);
    }
}