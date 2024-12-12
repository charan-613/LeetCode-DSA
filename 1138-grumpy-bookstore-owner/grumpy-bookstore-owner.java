class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l = 0;
        int sum_mins = 0;
        int current_grumpy_satisfaction = 0;
        int max_grumpy_satisfaction = 0;

        if(customers.length != grumpy.length){
            return 0;
        }

        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0){
                sum_mins += customers[i];
            }
        }

        for(int r = 0; r < customers.length; r++){
            if(grumpy[r] == 1){
                current_grumpy_satisfaction += customers[r];
            }

            if(r - l + 1 > minutes){
                if(grumpy[l] == 1){
                    current_grumpy_satisfaction -= customers[l];
                }
                l++;
            }

            max_grumpy_satisfaction = Math.max(max_grumpy_satisfaction, current_grumpy_satisfaction);
        }
        return sum_mins + max_grumpy_satisfaction;
    }
}