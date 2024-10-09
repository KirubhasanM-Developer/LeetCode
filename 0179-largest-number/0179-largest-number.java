class Solution {
    public String largestNumber(int[] nums) {
        
        int n=nums.length;
    String arr[]=new String[n];


    for(int i=0;i<n;i++){

        arr[i]=String.valueOf(nums[i]);
    }
    String str1="";
    String str2="";

    for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    
            str1=arr[i]+arr[j];
            str2=arr[j]+arr[i];

            if(str1.compareTo(str2)<0){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
               


            }



    }

    String ans="";

    for(String s:arr){
ans+=s;
    }
    if(ans.charAt(0)=='0'){
        return "0";
    }

return ans;



    }
}