class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        boolean odd=false;
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            int k=entry.getValue();
            if(k%2==0){
                ans+=k;
            }
            else{
                ans+=k-1;
                odd=true;
            }
        }
        if(odd){
            ans++;
        }
        return ans;
    }
}