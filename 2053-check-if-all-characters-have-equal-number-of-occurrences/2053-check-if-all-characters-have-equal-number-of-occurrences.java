class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }
            else{
                int m=hm.get(s.charAt(i));
                m++;
                hm.put(s.charAt(i),m);
            }
        }
        int value=hm.get(s.charAt(0));

        for(char key : hm.keySet()) {
            if(hm.get(key) != value) {
                return false;
            }
        }
        return true;
        
    }
}