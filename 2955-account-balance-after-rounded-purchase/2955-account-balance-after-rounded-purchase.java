class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int ans=(purchaseAmount+5)/10;
        return 100-(10*(int)Math.floor(ans));
        
    }
}