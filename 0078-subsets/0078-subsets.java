class Solution {
    public List<List<Integer>> subsets(int[] nums) {
          
          List<List<Integer>>li=new ArrayList<>();
          li.add(new ArrayList<>());
          for(int num:nums){
            int l=li.size();
            for(int i=0;i<l;i++){
                List<Integer>inner=new ArrayList<>(li.get(i));
                inner.add(num);
                li.add(inner);

            }
          }


return li;
    }
}