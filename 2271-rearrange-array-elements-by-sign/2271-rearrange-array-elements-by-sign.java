class Solution {
    public int[] rearrangeArray(int[] nums) {
       Queue<Integer>pos=new LinkedList<>();
       Queue<Integer> neg=new LinkedList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            pos.add(nums[i]);
        }else{
            neg.add(nums[i]);
        }
       } 
       for(int i=0;i<nums.length;i++){
        if(i%2==0){
            nums[i]=pos.remove();
        }else{
            nums[i]=neg.remove();
        }

       }
       return nums;   
    }
}