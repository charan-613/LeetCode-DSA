class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (hm.containsKey(n)) {
                int prev = hm.get(n);
                hm.put(n, prev + 1);
            }
            else {
                hm.put(n, 1);
            }
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }
}

