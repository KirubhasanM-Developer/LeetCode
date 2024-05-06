class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int i=0;
        List<Integer>li=new ArrayList<>();
        int j=0;
        while(i<nums.length){
            if(nums[i]==key){
                 for (j = Math.max(j, i - k); j <= i + k && j < nums.length; ++j)
                li.add(j);









            }
            i++;
        }


     return li;
        
    }
      
}