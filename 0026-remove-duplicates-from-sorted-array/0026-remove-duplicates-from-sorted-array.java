class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int j=0;
        List<Integer>li=new ArrayList<>(hs);
        Collections.sort(li);
        for(int si:li){
            nums[j]=si;
            j++;
        }
        return hs.size();
        
    }
}