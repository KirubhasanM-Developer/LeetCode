class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack <Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }

            }else{
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                    ans+=s.charAt(i);
                }else{
                    st.pop();
                    if(!st.isEmpty()){
                    ans+=s.charAt(i);}
                }
            }
        }
        return ans;
        
    }
}