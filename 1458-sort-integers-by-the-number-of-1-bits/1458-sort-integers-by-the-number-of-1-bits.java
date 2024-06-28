class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[][] pairs = new int[n][2];
        
        // Step 1: Store each element and its bit count in a 2D array
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = Integer.bitCount(arr[i]);
        }
        
        // Step 2: Sort the 2D array based on the number of 1s (second column)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pairs[j][1] > pairs[j + 1][1] || (pairs[j][1] == pairs[j + 1][1] && pairs[j][0] > pairs[j + 1][0])) {
                    // Swap elements in pairs[][]
                    int temp0 = pairs[j][0];
                    int temp1 = pairs[j][1];
                    pairs[j][0] = pairs[j + 1][0];
                    pairs[j][1] = pairs[j + 1][1];
                    pairs[j + 1][0] = temp0;
                    pairs[j + 1][1] = temp1;
                }
            }
        }
        
        // Step 3: Extract the sorted values from the sorted 2D array into sortedArray[]
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = pairs[i][0];
        }
        
        // Step 4: Return the sorted array
        return sortedArray;
    }
}
