class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
    for(int price:prices){
        if(price<min){
            min=price;
        }
        int ans=price-min;
        if(ans>max){
            max=ans;
        }
        
    }
return max;
        
    }
}