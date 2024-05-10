class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int l=0,k=0;
        int ans[][]=new int[r][c];
        for(int i=0;i<m;i++){
           
            for(int j=0;j<n;j++){
               
                ans[l][k]=mat[i][j];
                k++;
                if(k==c){
                    k=0;
                    l++;
                }
                

            }
            
         }
         
         return ans;
        
    }
}