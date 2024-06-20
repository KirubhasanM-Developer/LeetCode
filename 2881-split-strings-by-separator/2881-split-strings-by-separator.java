class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        // Iterate over each word in the list
        for (String word : words) {
            // Split the current word by the given separator
            String op="\\" + separator;
            String[] parts = word.split(op);

            // Add non-empty parts to the result list
            for (String part : parts) {
                if (!part.isEmpty()) {
                    result.add(part);
                }
            }
        }

        return result;
    
        
    }
}