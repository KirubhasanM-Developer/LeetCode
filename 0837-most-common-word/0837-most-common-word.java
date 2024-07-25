import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert the paragraph to lowercase and replace non-letter characters with spaces
        String para = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");

        // Convert the banned list to a set for faster lookups
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Split the paragraph into words
        String[] words = para.split("\\s+");

        // Use a HashMap to count the occurrences of each word
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.trim();
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Find the word with the maximum count
        String mostCommon = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}
