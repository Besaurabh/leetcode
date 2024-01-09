class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
        return 0; 
    }

    int maxProfit = 0;
    int minPrice = prices[0];

    for (int i = 1; i < prices.length; i++) {
        int currentPrice = prices[i];
       
        minPrice = Math.min(minPrice, currentPrice);
        
        int potentialProfit = currentPrice - minPrice;
       
        maxProfit = Math.max(maxProfit, potentialProfit);
    }

    return maxProfit;
    }
}