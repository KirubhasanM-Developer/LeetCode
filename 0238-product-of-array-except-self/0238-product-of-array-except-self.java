class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int pref[]=new int[n];
      int suff[]=new int[n];
      pref[0]=1;
      suff[n-1]=1;
      for(int i=1,j=n-2;i<n&&j>=0;i++,j--){
        pref[i]=pref[i-1]*nums[i-1];
        suff[j]=suff[j+1]*nums[j+1];
      }
      for(int i=0;i<n;i++){
        nums[i]=pref[i]*suff[i];
      }
      
      
            return nums;
        
    }
}