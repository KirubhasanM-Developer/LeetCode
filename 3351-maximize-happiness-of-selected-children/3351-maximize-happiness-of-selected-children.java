class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0,j=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
ans+=Math.max(happiness[i]-j,0);


j++;


        }
        return ans;
    }
}