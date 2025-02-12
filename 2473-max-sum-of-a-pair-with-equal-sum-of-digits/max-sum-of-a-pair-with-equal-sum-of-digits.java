class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = -1;
        for(int num : nums){
            int sum = digitSum(num);

            if(hm.containsKey(sum)){
                int potentialMax = num + hm.get(sum);
                max = Math.max(max, potentialMax);
            }
            hm.put(sum, Math.max(hm.getOrDefault(sum, -1), num));
        }
        return max;
    }
        
    public static int digitSum(int num){
        String numStr = Integer.toString(num);
        char[] charArray = numStr.toCharArray();
        int digitSum = 0;
        
        for (char c : charArray) {
            digitSum += c - '0';
        }
        return digitSum;
    }
}