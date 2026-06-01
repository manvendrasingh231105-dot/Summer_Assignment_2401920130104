package Week_1.Day_1;

class Solution {
    public int maxP(int[] prices) {

        int buy = 0;   
        int sell = 1;  
        int maxP = 0;

        while (sell < prices.length) {

            if (prices[sell] > prices[buy]) {
                
                int profit = prices[sell] - prices[buy];
                maxP = Math.max(maxP, profit);
            } else {
                
                buy = sell;
            }

            sell++;
        }

        return maxP;
    }
}
