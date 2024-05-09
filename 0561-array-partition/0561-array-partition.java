class Solution {
    public int arrayPairSum(int[] nums) {
        int div=nums.length/2;
int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){

sum+=nums[i];
        }
        return sum;



        
    }
}