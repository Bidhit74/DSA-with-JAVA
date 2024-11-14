public class BuyAndSellStocks {
    //Q :- You are given an array prices where prices[i] is the price of a given stock on the 'ith' day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. if you cannot achieve any profit, return 0.

    // Time Complexity :- O(n)
    /* 
    public static int buyAndSellStocks(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice; // today profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    */
    // Time Complexity :- O(n)
    public static int buyAndSellStocks(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            // Update max profit if current price gives a better profit
            maxProfit = Math.max(maxProfit, (prices[i] - buyPrice));
            // Update buyPrice if current price is lower
            buyPrice = Math.min(buyPrice, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
