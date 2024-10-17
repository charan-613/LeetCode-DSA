class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>(); 

        for (int num : nums) {
            uniqueNums.add(num);
        }
        
        int[] uniqueArray = new int[uniqueNums.size()];
        int index = 0;
        for (int num : uniqueNums) { 
            uniqueArray[index++] = num;
        }
        Arrays.sort(uniqueArray); 

        if (uniqueArray.length < 3) {
            return uniqueArray[uniqueArray.length - 1]; 
        }
        else {
            return uniqueArray[uniqueArray.length - 3]; 
        }
    }
}
