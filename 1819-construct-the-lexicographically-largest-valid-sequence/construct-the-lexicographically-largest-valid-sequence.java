class Solution {

    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];  
        Arrays.fill(res, 0);

        Set<Integer> used = new HashSet<>();  // Set to track used numbers

        backtrack(res, used, 0, n);
        return res;  
    }

    // Helper method for backtracking
    private boolean backtrack(int[] res, Set<Integer> used, int i, int n) {
        if(i == res.length){
            return true;
        }

        for(int num = n; num >= 1; num--){
            if(used.contains(num)){
                continue;
            }
            if(num > 1 && (i + num >= res.length || res[i + num] != 0)){
                continue;
            }
            used.add(num);
            res[i] = num;
            if(num > 1){
                res[i + num] = num;
            }

            int j = i + 1;
            while(j < res.length && res[j] != 0){
                j++;
            }
            if(backtrack(res, used, j, n)){
                return true;
            }
            // Backtrack: undo the decision
            used.remove(num);
            res[i] = 0;
            if (num > 1) {
                res[i + num] = 0;
            }
        }
        return false;
    }
}