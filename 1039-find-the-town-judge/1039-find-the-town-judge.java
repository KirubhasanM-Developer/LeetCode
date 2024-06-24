class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){
            return 1;
        }
        int arr[]=new int[n+1];
        int k=trust.length;
        int arr1[]=new int[n+1];

        for(int i=0;i<k;i++){
          arr[trust[i][1]]+=1;
          arr1[trust[i][0]]+=1; 

  }
  for(int i=0;i<n+1;i++){
    if(arr[i]==(n-1)&&arr1[i]==0){
        return i;
    }
  }
  return -1;
    }
}