class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>li1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    li1.add(1);
                }else{
                    li1.add(li.get(i-1).get(j-1)+li.get(i-1).get(j));
                }
            }
            li.add(li1);

        }
        return li;
    }
}