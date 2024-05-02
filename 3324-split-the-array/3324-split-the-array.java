class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int distinct=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
           if(i<=nums.length-3&&nums[i]==nums[i+1]&&nums[i+1]==nums[i+2]){
                return false;
            }else{
                distinct++;
            }
        
            
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            distinct++;
        }
        if(distinct>=nums.length/2){
            return true;
        }
        else{
            return false;
        }

        
    }
}