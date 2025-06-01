package Arrays;


public class BuyAndSellStocks {
    public static int MaxProfit(int prices []) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                
                if(profit> maxProfit){
                    maxProfit = profit;
                }
               
            }else{
                buyPrice = prices[i];
            }
        }return maxProfit;

    } 
        public static void main(String[] args) {
       int prices [] = {7, 1, 5, 3, 6, 4};
       System.out.println(MaxProfit(prices));

    }
}
// O(n) -> Time Complexity
