class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ans=coordinates.charAt(0);
        int a=coordinates.charAt(1)-'0';
        if(((ans=='a'||ans=='c'||ans=='e'||ans=='g')&&(a%2==1))||((ans=='b'||ans=='d'||ans=='f'||ans=='h')&&(a%2==0))){
            return false;
        }
        return true;
    }
}