class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
int n=nums1.length;
int n1=nums2.length;
int ans1=0,ans2=0;
for(int i=0;i<n;i++){
    ans1=ans1^nums1[i];
}
for(int i=0;i<n1;i++){
    ans2=ans2^nums2[i];
}
if(n%2==0&&n1%2==0){
    return 0;

}else if(n%2==0&&n1%2!=0){
    return ans1;
}else if(n%2!=0&&n1%2==0){
    return ans2;
}else if(n%2!=0&&n1%2!=0){
    return ans1^ans2;
}
   
   return 0;
                  } 
}