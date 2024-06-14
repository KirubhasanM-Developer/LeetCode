class Solution {
    public boolean isPalindrome(int x) {
        int n=x,sum=0;
        
      
        while(x>0){
            int i=x%10;
             sum=(sum*10)+i;
            x=x/10;
          

        }
        return n==sum;
    }
}