class Solution {
    public int maxProfit(int[] prices) {
        int buypr = Integer.MAX_VALUE;
        int maxpro = 0;
        for(int i=0;i<prices.length;i++){
            if(buypr<prices[i]){
                int profit= prices[i]-buypr;
                maxpro= Math.max(maxpro,profit);
            }else{
                buypr = prices[i];
            }
        }
        return maxpro;
        
    }
}
