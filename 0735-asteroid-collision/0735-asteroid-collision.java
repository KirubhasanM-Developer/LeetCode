class Solution {
    public int[] asteroidCollision(int[] asteroids) {
 Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean exploded = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                exploded = true;
                break;
            }

            if (!exploded) {
                stack.push(asteroid);
            }
        }
        
        
        int []ar=new int[stack.size()];

        for(int i=ar.length-1;i>=0;i--){
            ar[i]=stack.pop();
        }
        return ar;
    }
}