class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        int sl = 3;
        int l = 0;
        int count = 0;
        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        
            if(r - l == sl){
                char tch = s.charAt(l);
                hm.put(tch, hm.get(tch) - 1);
                if(hm.get(tch) == 0){
                    hm.remove(tch);
                }
                l++;
            }

            if(hm.size() == sl){
                count += 1;

            }
        }
        return count;
    }
}