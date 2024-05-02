class Solution {
    public int maxDistance(int[] colors) {
        int i=0,j=colors.length-1;
        int max=Integer.MIN_VALUE;
        if(colors[i]!=colors[colors.length-1]){
            return Math.abs(i-j);
        }
        
     for(i=0;i<=colors.length/2;i++){
       j=colors.length-1;
      while(j>i){
                  if(colors[i]!=colors[j]){
                    if(max<Math.abs(i-j)){
                        max=Math.abs(i-j);
                      
                    }
                    break;
                  }else{
                    j--;
                  }
                  
      }}
        return max;
        
    }
}