class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;   
        int max_profit = 0;

        for(int price : prices){
            if(price < min){
                min = price;
            }
            else if(price - min > max_profit){
                max_profit = price - min;
            }
        }
        return max_profit;
    }
}