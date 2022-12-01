package uz.leetCode.arrays;

public class CountPrefixOfCurrentString {

    public int countPrefixes(String[] words, String s) {
        short counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                counter++;
            }
        }
        return counter;
    }
}
