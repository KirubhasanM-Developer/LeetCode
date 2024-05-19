class Solution {
    public int addDigits(int num) {
        int sum=0,i=1;
        

       
while(num>=10){
    sum=0;
        while(num>0){
            i=num%10;
            sum+=i;
            num=num/10;
        }
        num=sum;
        }
      return num;  
    }
}