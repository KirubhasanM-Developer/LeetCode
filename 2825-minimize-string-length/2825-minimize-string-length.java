class Solution {
    public int minimizedStringLength(String s) {
       
        List<Character>li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!li.contains(s.charAt(i))){
                li.add(s.charAt(i));
               
            }
        }
        return li.size();
    }
}