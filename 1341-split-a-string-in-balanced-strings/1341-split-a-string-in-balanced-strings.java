class Solution {
    public int balancedStringSplit(String s) {
        Stack <Character>st=new Stack<>();
        int ans=0;

        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else if(st.peek()=='R'){
                if(s.charAt(i)=='R'){

              
                st.push(s.charAt(i));}else {
                    st.pop();
                }
                if(st.isEmpty()){
                    ans++;
                }
            }else if(st.peek()=='L'){
               if(s.charAt(i)=='L'){
                st.push(s.charAt(i));
               }else{
                st.pop();
               }
                if(st.isEmpty()){
                    ans++;
                }
            }
        }
        return ans;
    }
}