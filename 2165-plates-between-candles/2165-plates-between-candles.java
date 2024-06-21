import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] ans = new int[queries.length];
        List<Integer> candles = new ArrayList<>();

        // Collect the positions of all candles
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                candles.add(i);
            }
        }

        // Process each query
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = findPlatesBetweenCandles(start, end, candles);
        }

        return ans;
    }

    private int findPlatesBetweenCandles(int s, int e, List<Integer> candles) {
        if (candles.isEmpty()) {
            return 0;
        }

        // Find the smallest value >= s using binary search
        int leftIdx = Collections.binarySearch(candles, s);
        if (leftIdx < 0) {
            leftIdx = -leftIdx - 1;
        }

        // Find the largest value <= e using binary search
        int rightIdx = Collections.binarySearch(candles, e);
        if (rightIdx < 0) {
            rightIdx = -rightIdx - 2;
        }

        // Validate the found indices
        if (leftIdx < candles.size() && rightIdx >= 0 && leftIdx < rightIdx) {
            int leftCandle = candles.get(leftIdx);
            int rightCandle = candles.get(rightIdx);
            return (rightCandle - leftCandle + 1) - (rightIdx - leftIdx + 1);
        }

        return 0;
    }
}
