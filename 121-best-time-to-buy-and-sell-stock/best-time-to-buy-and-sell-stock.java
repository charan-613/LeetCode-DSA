class Solution {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int price : prices){
            if(price < min_val){
                min_val = price;
            }
            else if(price - min_val > max_profit){
                max_profit = price - min_val;
            }
        }
        return max_profit;
    }
}