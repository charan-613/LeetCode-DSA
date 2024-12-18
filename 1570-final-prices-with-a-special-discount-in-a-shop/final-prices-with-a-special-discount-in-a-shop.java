class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] final_prices = new int[n];
        for(int i = 0; i < n; i++){
            int discount = findDiscount(i,prices);
            final_prices[i] = prices[i] - discount;
        }
        return final_prices;
    }

    public static int findDiscount(int i, int[] prices){
        for(int j = i + 1; j < prices.length; j++){
            if(prices[j] <= prices[i]){
                return prices[j];
            }
        }
        return 0;
    }
}