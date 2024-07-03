class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int key=image[sr][sc];
        if(image[sr][sc]!=color){
         recursion(sr,sc,color,image,key);}
          return image;
    }
    public  static  void recursion(int sr,int sc,int color,int image[][],int key){
        if(sr<0||sr>image.length-1||sc<0||sc>image[0].length-1||image[sr][sc]!=key){
            return;
        }
if(image[sr][sc]==key){
         image[sr][sc]=color;
}
recursion(sr+1, sc, color, image, key);
recursion(sr-1, sc,color,image, key);
recursion( sr, sc+1, color, image, key);
recursion( sr, sc-1, color,image, key);

    }
}