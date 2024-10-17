class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>(); 

        for (int num : nums) {
            uniqueNums.add(num);
        }
        Integer[] uniqueArray = uniqueNums.toArray(new Integer[0]);
        Arrays.sort(uniqueArray); 

        if (uniqueArray.length < 3) {
            return uniqueArray[uniqueArray.length - 1]; 
        }
        else {
            return uniqueArray[uniqueArray.length - 3]; 
        }
    }
}
