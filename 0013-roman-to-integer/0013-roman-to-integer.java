class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0; // to track previous value
        
        for (int i = 0; i < s.length(); i++) {
            int currValue = getValue(s.charAt(i));
            
            // If previous value is less than current value, subtract twice the previous value
            if (prevValue < currValue) {
                sum += currValue - 2 * prevValue;
            } else {
                sum += currValue;
            }
            
            prevValue = currValue;
        }
        
        return sum;
    }
    
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
