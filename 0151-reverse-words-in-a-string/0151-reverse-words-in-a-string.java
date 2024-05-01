class Solution {
    public String reverseWords(String s) {
       s= s.trim();
        s=s.replaceAll("\\s+"," ");
        String str[]=s.split(" ");
        String ans="";
        int p=0;
        for(int i=str.length-1;i>=0;i-- ){
        if(i==p){ans+=str[i];}
        else{ans+=str[i]+" ";}
        }
        return ans;
        
    }
}