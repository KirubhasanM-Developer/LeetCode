class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=2){
            return true;
        }
        int e=(int)Math.sqrt(c);
       
        int s=0;
     
        while(s<=e){
            if((Math.pow(s,2)+Math.pow(e,2))==c){
                return true;
            }
            else if((Math.pow(s,2)+Math.pow(e,2))<c){
                s++;
            }else{
                e--;
            }






        }
        return false;

        
    }
}