class Solution {
    public int findComplement(int num) {
        int n=num;
         String ans=Integer.toBinaryString(n);
        String ans1="";
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='0'){
                ans1+='1';
            }else{
                ans1+='0';
            }
        }
return Integer.parseInt(ans1,2);
        
        
    }
}