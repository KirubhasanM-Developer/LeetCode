class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap  <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{int s=hm.get(arr[i]);
            s++;
                hm.put(arr[i],s);
            }
        }

        HashSet<Integer>hs=new HashSet<>();
        for(Integer value:hm.values()){
            if(!hs.add(value)){
                return false;
            }
        }
        return true; 
        
    }
}