class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            if (num < pivot) {
                result.add(num);
            }
        }
        
        for (int num : nums) {
            if (num == pivot) {
                result.add(num);
            }
        }
        
        for (int num : nums) {
            if (num > pivot) {
                result.add(num);
            }
        }

        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        
        return arr;
    }
}
