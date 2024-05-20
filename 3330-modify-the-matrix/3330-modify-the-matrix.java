class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int ans[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-1){
                    int max=0;
                    for(int hi=0;hi<row;hi++){
                        max=Math.max(max,matrix[hi][j]);
                    }
                    ans[i][j]=max;


                }else{
                    ans[i][j]=matrix[i][j];
                }
            }
        }return ans;
        
    }
}