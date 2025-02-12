class Solution {
    public int[] decode(int[] encoded) {
         int n = encoded.length + 1;
        int totalXOR = 0;
        for (int i = 1; i <= n; i++) {
            totalXOR ^= i;
        }
        
        int encodedXOR = 0;
        for (int i = 1; i < n - 1; i += 2) {
            encodedXOR ^= encoded[i];
        }
        
        int firstElement = totalXOR ^ encodedXOR;
        int[] perm = new int[n];
        perm[0] = firstElement;
        
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        
        return perm;
    }
}