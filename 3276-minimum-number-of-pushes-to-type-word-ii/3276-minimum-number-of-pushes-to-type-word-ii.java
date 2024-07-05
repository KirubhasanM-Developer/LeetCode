class Solution {
    public int minimumPushes(String word) {
        HashMap <Character,Integer>hm=new HashMap<>();
        int count=0,sum=0;
        for(int i=0;i<word.length();i++){
            if(!hm.containsKey(word.charAt(i))){
               
                hm.put(word.charAt(i),1);
            }
            else{
                int k=hm.get(word.charAt(i));
                hm.put(word.charAt(i),++k);
            }
           
        }
List<Integer>li=new ArrayList<>();
        for(Map.Entry<Character,Integer>ji:hm.entrySet()){
            li.add(ji.getValue());      }
            Collections.sort(li);
            Collections.reverse(li);
            for(int i=0;i<li.size();i++){
                if(i%8==0){
                    count++;
                }

                sum+=(li.get(i)*count);
            }
      return sum;
    }
}