class Solution {
    public int maxProductDifference(int[] nums) {
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    int firstmax=Integer.MIN_VALUE;
    int firstmin=Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            firstmin=min;
            min=nums[i];
        }else if(nums[i]<firstmin){
            firstmin=nums[i];}
            if(nums[i]>max){
            firstmax=max;
            max=nums[i];
        }else if(nums[i]>firstmax){
            firstmax=nums[i];
        }
    }
    return (max*firstmax)-(min*firstmin);
        
    }
}