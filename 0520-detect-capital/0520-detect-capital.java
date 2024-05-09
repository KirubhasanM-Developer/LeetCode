class Solution {
    public boolean detectCapitalUse(String word) {
        String str=word.toLowerCase();
        String s=word.toUpperCase();
     return  ( word.equals(s)  ||
       word.equals(str) ||  
    
 (  ( (word.substring(1,word.length())).equals((str).substring(1,str.length()) ) )   &&
       (     (word.substring(0,1)).equals((s).substring(0,1)))));     




            
        
        
    }
}