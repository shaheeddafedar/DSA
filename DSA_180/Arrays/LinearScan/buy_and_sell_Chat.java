// given by chatgpt 121 on leetcode

package DSA_180.Arrays.LinearScan;

public class buy_and_sell_Chat {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

}

    // Complexity
// Time: O(n)
// Space: O(1)


// Brute Force
//     public int maxProfit(int[] prices) {
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {

//                 int profit = prices[j] - prices[i];

//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }

//         return maxProfit;
//     }

// Complexity
// Time: O(n²)
// Space: O(1)