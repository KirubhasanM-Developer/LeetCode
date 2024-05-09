class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        int ans=n;
       while(i<=n){
        ans=ans-i;
        if(ans==0){
            return i;
                  
        } 
        if(ans<0){
            return i-1;
        }
        i++;


        }
        return i;
        
    }
}