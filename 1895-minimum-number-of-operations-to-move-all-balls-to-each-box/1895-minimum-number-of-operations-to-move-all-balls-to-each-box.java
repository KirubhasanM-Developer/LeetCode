class Solution {
    public int[] minOperations(String boxes) {
        int ans=0;
        int n=boxes.length();
        int answer[]=new int[n];
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(j!=i){ 
                if(boxes.charAt(j)=='1'){
                answer[i]+=(Math.abs(i-j));
            }




           }
        } }
        return answer;
        
    }
}