class Solution {
    public List<String> generateParenthesis(int n) {
        int open=n;
        int close=n;
        ArrayList<String>li=new ArrayList<>();
        solve(open,close,"",li);
return li;

    }

    public  static void solve(int open,int close,String s,ArrayList<String>li){
        if(open==0&&close==0){
            li.add(s);
            return;
        }
    if(open>0){
        solve(open-1,close,s+'(',li);
    }
    if(close>open&&close>0){
        solve(open,close-1,s+')',li);
    }
    }










}