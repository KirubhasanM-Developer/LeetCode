/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {


         int mid=1,start=1,end=n;


        while(mid>=1&&mid<=n){
            mid=start+(end-start)/2;
        boolean ans=isBadVersion(mid);

            if(ans&&isBadVersion(mid-1)==false){
                return mid;
            }else if(ans){
              end=mid-1 ;
            }else if(ans==false){
                start=mid+1;
            }
        }
        return mid;
        
    }
}