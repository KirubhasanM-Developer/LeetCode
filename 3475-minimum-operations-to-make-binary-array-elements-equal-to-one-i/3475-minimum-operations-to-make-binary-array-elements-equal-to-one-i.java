class Solution {
    public int minOperations(int[] nums) {
       if(nums.length<3){
        return -1;
       } 
       int ans=0;
       for(int i=0;i<nums.length-2;i++){
        if(nums[i]==0){
            nums[i]=(nums[i]==0?1:0);
            nums[i+1]=(nums[i+1]==0?1:0);
            nums[i+2]=(nums[i+2]==0?1:0);
            ans++;
        }
       }
       if(nums[nums.length-1]==1&&nums[nums.length-2]==1){
        return ans;
       }else{
        return -1;
       }
    }
}