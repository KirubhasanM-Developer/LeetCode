class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
       
            List<Integer>li=new ArrayList<>();
            for(int i=0;i<n;i++){
                li.add(i);
            }
            int ans[]=new int[n];
            int o=0,p=0;
           while(!li.isEmpty()){
            if(o%2==0){
                ans[li.get(0)]=deck[p];
                p++;
                li.remove(0);

            }else{
int k=li.get(0);
li.remove(0);
li.add(k);
            }o++;

           }
            

return ans;
        
        
    }
}