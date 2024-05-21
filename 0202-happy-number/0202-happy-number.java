class Solution {
    public boolean isHappy(int n) {
       List<Integer>li=new ArrayList<>();
        int sum=0,i=0;
        while(n>=2){
            sum=0;
            while(n>0){
                i=n%10;
                sum+=(i*i);
                n=n/10;

            }
            if(!li.contains(sum)){
                li.add(sum);
                  n=sum;
            }else{
                return false;
            }
          
        }
        return n==1?true:false;
        
    }
}