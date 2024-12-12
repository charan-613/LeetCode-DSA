class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> strList = new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for(int r = 0; r <= s.length() - 10; r++){
            String substring = s.substring(r, r + 10);

            if(seen.contains(substring)){
                repeated.add(substring);
            }
            else{
                seen.add(substring);
            }
        } 
        strList.addAll(repeated);
        return strList;
    }
}