class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the minimum price seen so far
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit if we sold at current price and update maxProfit if it's higher
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
