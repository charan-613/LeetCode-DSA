class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1];
        long chemistry = 0;

        int i = 0, j = n - 1;
        while (i < j) {
            if (skill[i] + skill[j] != totalSkill) {
                return -1;
            }
            chemistry += skill[i] * skill[j];
            i++;
            j--;
        }
        return chemistry;
    }
}
