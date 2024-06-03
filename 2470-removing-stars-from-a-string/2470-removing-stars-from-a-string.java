class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        Stack <Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='*'){
                
                sb.append(c);

            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        
     return  sb.toString();   
    }
}