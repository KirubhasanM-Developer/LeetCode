class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String ans[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

         HashSet<String>hs=new HashSet<>();
         for(int i=0;i<words.length;i++){
            String s="";
            for(int j=0;j<words[i].length();j++){
                s+=ans[words[i].charAt(j)-'a'];
            }
            hs.add(s);
         }
         return hs.size();

    }
}