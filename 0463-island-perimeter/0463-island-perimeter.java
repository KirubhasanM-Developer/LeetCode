class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    continue;
                }else {
                    if(j==0||grid[i][j-1]==0){
                        sum++;
                    }
                     if(j==grid[0].length-1||grid[i][j+1]==0){
                        sum++;
                    }
                     if(i==0||grid[i-1][j]==0){
                        sum++;
                    }
                 if(i==grid.length-1||grid[i+1][j]==0){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}