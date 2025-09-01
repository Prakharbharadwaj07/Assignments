package assignment12;

public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track minimum price so far
        int maxProfit = 0;                 // Track max profit so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // Update min price if current price is lower
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Update max profit if current profit is higher
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Max profit for prices1: " + maxProfit(prices1));  // Output: 5
        System.out.println("Max profit for prices2: " + maxProfit(prices2));  // Output: 0
    }
}
