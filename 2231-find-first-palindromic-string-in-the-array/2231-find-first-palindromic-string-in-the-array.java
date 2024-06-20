class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder sc=new StringBuilder(words[i]);
            sc.reverse();
            if(sc.toString().equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}