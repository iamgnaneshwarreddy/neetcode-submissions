class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;

        int min = prices[0];

        for(int i : prices){
            int currP = i - min;
            maxP = Math.max(maxP,currP);

            if(i<min){
                min = i;
            }
        }
        return maxP;
    }
}
