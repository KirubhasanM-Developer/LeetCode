class Solution {
    public int percentageLetter(String s, char letter) {
        int ans=0;
        char c=letter;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                ans++;
            }

        }
       int p=(ans*100)/s.length();
       return p;
        
    }
}