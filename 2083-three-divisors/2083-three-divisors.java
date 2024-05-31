class Solution {
    int i=0;
    public boolean isThree(int n) {
        int count=2;
        if(isprime(n)){
            return false;
        }
        for(i=i;i<=n/2;i++){
            if(n%i==0){

                count++;
            }
            if(count>3){
                break;
            }
        }
        return count==3;
        
    }
    boolean isprime(int n){
        for(i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }        }
            return true;
    }
}