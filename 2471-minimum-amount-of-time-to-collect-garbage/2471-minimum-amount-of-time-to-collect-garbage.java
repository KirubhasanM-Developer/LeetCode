class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
         int freq[]=new int[3];
         for(int i=0;i<garbage.length;i++){
            int n=garbage[i].length();
            for(int j=0;j<n;j++){
                if(garbage[i].charAt(j)=='G'){
                    freq[0]++;
                }
                else if(garbage[i].charAt(j)=='P'){
                    freq[1]++;

                }
                else{
                    freq[2]++;
                }
            }
         }

         int last[]=new int[3];
         for(int i=0;i<garbage.length;i++){
            if(garbage[i].contains("G")){
                last[0]=i;
            }
             if(garbage[i].contains("P")){
                last[1]=i;
            }
            if(garbage[i].contains("M"))
            {
                last[2]=i;
            }
         }
        for(int i=1;i<travel.length;i++){
            travel[i]=travel[i]+travel[i-1];
        }
        int sum=0;
         for(int i=0;i<3;i++){
            if(last[i]!=0){
              sum+=(travel[last[i]-1]);}
              sum+=freq[i];
         }
         
       return sum;  
         
         
             }
}