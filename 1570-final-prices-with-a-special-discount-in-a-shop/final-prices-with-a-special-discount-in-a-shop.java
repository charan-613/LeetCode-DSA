class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] final_prices = new int[n];
        for(int i = 0; i < n; i++){
            final_prices[i] = prices[i];
            for(int j = i + 1; j < n; j++){
                if(prices[j] <= prices[i]){
                    final_prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return final_prices;
    }
}