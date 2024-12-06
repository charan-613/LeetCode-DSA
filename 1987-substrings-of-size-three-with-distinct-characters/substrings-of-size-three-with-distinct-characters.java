class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int k = 3;
        for(int i = 0; i < n - k + 1; i++){
            boolean temp = fun(s.substring(i, i + k), k);
            if(temp){
                count += 1;
            }
        }
        return count;
    }

    public static boolean fun(String s, int k){
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        if(set.size() == k){
            return true;
        }
        else{
            return false;
        }
    }
}