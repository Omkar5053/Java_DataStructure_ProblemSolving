package Arrays;

public class BuyAndSellStock {
    public static void main(String[]args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(getprofit(prices));
    }

    private static int getprofit(int[] prices)
    {
        //we should keep sell price as much as possible maximum
        int sellprice;
        //we should keep buy price as much as possible minimum
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++)
        {
            sellprice = prices[i];
            if(sellprice < buyPrice) //if it will true means that day we can buy stock instead of sell,
                                     // since profit = sellprice - buyprice,
                                     // so we should keep sellprice max and buyprice min
            {
                buyPrice = sellprice;
            } else                 //it means here we can earn profit
            {
                int profit = sellprice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);  //it will track max profit with previous maxProfit
            }
        }
        return maxProfit;
    }
}
