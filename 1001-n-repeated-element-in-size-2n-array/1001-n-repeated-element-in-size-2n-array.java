class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap <Integer,Integer>hm=new HashMap<>();
        int n=nums.length/2;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{int s=(hm.get(nums[i]));
            s++;
                hm.put(nums[i],s);
            }if(hm.get(nums[i])==n){
                break;
            }
        }
        return nums[i];
        
    }
}