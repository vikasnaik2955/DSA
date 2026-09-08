public class StockProfit {

    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        System.out.println("Max Profit is : "+stockProfit(prices));
    }

    private static int stockProfit(int[] prices) {
        int minProfit = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - minProfit;
            maxProfit = Math.max(maxProfit,cost);
            minProfit = Math.min(minProfit, prices[i]);
        }

        return maxProfit;
    }
}
