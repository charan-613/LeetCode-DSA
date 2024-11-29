import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        List<int[]> frequencies = new ArrayList<>();
        
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            boolean found = false;
            for (int i = 0; i < frequencies.size(); i++) {
                if (Arrays.equals(frequencies.get(i), count)) {
                    groups.get(i).add(str);
                    found = true;
                    break;
                }
            }
            if (!found) {
                frequencies.add(count);
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groups.add(newGroup);
            }
        }
        return groups;
    }
}
