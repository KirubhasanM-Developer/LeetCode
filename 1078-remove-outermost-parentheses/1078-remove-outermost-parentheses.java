class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack <Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }

            }else{
                if(s.charAt(i)=='('){
                    st.push(s.charAt(i));
                    sb.append(s.charAt(i));
                }else{
                    st.pop();
                    if(!st.isEmpty()){
                    sb.append(s.charAt(i));}
                }
            }
        }
        return sb.toString();
        
    }
}