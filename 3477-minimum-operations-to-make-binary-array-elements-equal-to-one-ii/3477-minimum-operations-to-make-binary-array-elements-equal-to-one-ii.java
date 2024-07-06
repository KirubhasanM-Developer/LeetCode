class Solution {
    public int minOperations(int[] nums) {
       int ans=0;
       int n=nums.length;
       int flip=0;
       for(int i=0;i<n;i++){
        if(nums[i]%2==0&&flip%2==0||nums[i]%2==1&&flip%2==1){
            flip++;
        }
       } 
       return flip;
         }
}