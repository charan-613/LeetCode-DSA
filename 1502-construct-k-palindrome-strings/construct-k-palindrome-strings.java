class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int odd = 0;

        for(int count : hm.values()){
            if(count % 2 != 0){
                odd++;
            }
        }
        return odd <= k;
    }
}