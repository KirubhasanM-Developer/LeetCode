class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.add(nums[i])){
                continue;
            }else{
                return true;
            }
        }
        return false;
        
    }
}