class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];        
        int[] freq = new int[20001];
          
        for (int num : nums) {
            freq[num + 10000]++;  
        }
        
        List<int[]> freqList = new ArrayList<>();
        for (int i = 0; i < 20001; i++) {
            if (freq[i] > 0) {
                freqList.add(new int[] {i - 10000, freq[i]});
            }
        }        
        freqList.sort((a, b) -> b[1] - a[1]);          
        for (int i = 0; i < k; i++) {
            result[i] = freqList.get(i)[0];  
        }
        
        return result;
    }
}
