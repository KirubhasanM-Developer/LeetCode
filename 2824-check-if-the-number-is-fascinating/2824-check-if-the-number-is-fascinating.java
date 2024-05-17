class Solution {
    public boolean isFascinating(int n) {
        int m=2*n;
        int l=3*n;
        String ans=Integer.toString(n);
        ans=ans+Integer.toString(m);
        ans=ans+Integer.toString(l);
        if(ans.length()!=9){
            return false;
        }
          boolean b=false;
        for(int i=1;i<=9;i++){
            for(int j=0;j<ans.length();j++){
                int y=ans.charAt(j)-'0';
                if(y==0){
                    return false;
                }
                if(y==i){
                    b=true;
                    break;
                }else{
                    b=false;
                }
            }
            if(b==false){
                return false;
            }
        }
 
       
             return b;
        
    }
}