class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        int key=0;
        if(ruleKey.equals("type")){
            key=0;

        }else if(ruleKey.equals("color")){
             key=1;

        }else{
            key=2;
        }
        for(int i=0;i<items.size();i++){
            List <String>ls=items.get(i);
            if(ls.get(key).equals(ruleValue)){
                ans++;
            }

        }
        return ans;

        
    }
}