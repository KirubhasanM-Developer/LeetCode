class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>();
       
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
        q.add(students[i]); 
        }for(int i=sandwiches.length-1;i>=0;i--){
            st.add(sandwiches[i]);
        }
        
        while(!st.isEmpty()&&!q.isEmpty()){
      if(q.contains(st.peek())){
            if(st.peek()==q.peek()){
                
                st.pop();
                q.remove();

            }

            else {
                int k=q.peek();
                q.remove();
                q.add(k);
                

            }}else{
                break;
            }
        }
        return q.size();
    }
}