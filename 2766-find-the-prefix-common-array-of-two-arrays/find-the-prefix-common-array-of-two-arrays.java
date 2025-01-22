class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] pref = new int[n];

        Set<Integer> seenA = new HashSet<>();
        Set<Integer> seenB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            seenA.add(A[i]);
            seenB.add(B[i]);

            int commonCount = 0;
            for (int num : seenA) {
                if (seenB.contains(num)) {
                    commonCount++;
                }
            }            
            pref[i] = commonCount;
        }
        return pref;
    }
}
