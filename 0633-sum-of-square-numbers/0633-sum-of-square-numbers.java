class Solution {
    public boolean judgeSquareSum(int c) {
       
        long e=(long)Math.sqrt(c);
       
        int s=0;
     
        while(s<=e){
            if((s*s)+(e*e)==c){
                return true;
            }
            else if((s*s)+(e*e)<c){
                s++;
            }else{
                e--;
            }






        }
        return false;

        
    }
}