class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice=Arrays.stream(aliceSizes).sum();
        int bob=Arrays.stream(bobSizes).sum();
        int ans=( alice+ bob)/2;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int ele:bobSizes){
            hm.put(ele,ele);
        }
        for(int mal:aliceSizes){
            int target=ans-(alice-mal);
            if(hm.containsKey(target)){
                return new int[]{mal,target};
            }
        }
        return new int[]{0,0};


        
    }
}