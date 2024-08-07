package programs.leetcode.array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maximumProfit = predict(prices);
		if (maximumProfit > 0) {
			System.out.println("Maximum Profit : " + maximumProfit);
		} else {
			System.out.println("No Profit");
		}
	}

	public static int predict(int[] prices) {
		int buy = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			buy = Math.min(buy, prices[i]);
			profit = Math.max(profit, prices[i]-buy);
		}
		return profit;
	}

}
