class Solution {
    public int minimumPushes(String word) {
        int count=0;
        int sum=0;
        for(int i=0;i<word.length();i++){
            if(i%8==0){
                count++;
            }
            sum+=count;
        }
        return sum;
    }
}