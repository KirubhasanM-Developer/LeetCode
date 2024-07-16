class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int b [] = new int[((nums1.length+nums2.length)/2)+1];
        int i=0,j=0,ind = 0;
        while(i<nums1.length & j<nums2.length & ind<b.length){
            if(nums1[i]<=nums2[j]){
                b[ind++] = nums1[i];
                i++;
            }
            else{
                b[ind++] = nums2[j];
                j++;
            }
        }

        while(ind<b.length & i<nums1.length){
            b[ind++] = nums1[i++];
        }

        while(ind<b.length & j<nums2.length){
            b[ind++] = nums2[j++];
        }  
        double ans = 0;
        if((nums1.length+nums2.length)%2==0 & b.length>=2){
             double v1 = (double)b[b.length-1];
             double v2 = (double)b[b.length-2];
             ans = (v1+v2)/2;
        }
        else if((nums1.length+nums2.length)%2!=0& b.length>=1){
            ans = (double)b[b.length-1];
        }
        return ans;
    }}
