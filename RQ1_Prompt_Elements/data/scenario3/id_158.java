package scenario3;


import java.util.List;


class FindMax {
    /**
     * Write a function that accepts a list of strings.
     * The list contains different words. Return the word with maximum number
     * of unique characters. If multiple strings have maximum number of unique
     * characters, return the one which comes first in lexicographical order.
     *
     * find_max(["name", "of", "string"]) == "string"
     * find_max(["name", "enam", "game"]) == "enam"
     * find_max(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
     *
     * > findMax(["name", "of", "string"])
     * "string"
     * > findMax(["name", "enam", "game"])
     * "enam"
     * > findMax(["aaaaaaa", "bb", "cc"])
     * "aaaaaaa"
     * > findMax(["abc", "cba"])
     * "abc"
     * > findMax(["play", "this", "game", "of", "footbott"])
     * "footbott"
     * > findMax(["we", "are", "gonna", "rock"])
     * "gonna"
     * > findMax(["we", "are", "a", "mad", "nation"])
     * "nation"
     * > findMax(["this", "is", "a", "prrk"])
     * "this"
     * > findMax(["b"])
     * "b"
     * > findMax(["play", "play", "play"])
     * "play"
     */
    public static String findMax(List<String> words) {
        String max = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= max.length()) {
                if (words.get(i).length() == max.length() && words.get(i).compareTo(max) >= 0)
                    continue;
                max = words.get(i);
            }
        }
        return max;
    }


}