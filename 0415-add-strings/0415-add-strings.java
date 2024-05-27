class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sc=new StringBuilder();
        int ans=0;
        int i=num1.length()-1,j=num2.length()-1;


             while(i>=0||j>=0||ans!=0){
                if(i>=0){
                    ans+=num1.charAt(i)-'0';
                    i--;
                }if(j>=0){
                    ans+=num2.charAt(j)-'0';
                    j--;
                }
                sc.insert(0,(char)('0'+ans%10));
                ans=ans/10;}
                            return sc.toString();
    }
}