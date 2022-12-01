package uz.leetCode.arrays;

public class CountingWordsWithGivenPrefix {
    public int prefixCount(String[] words, String pref) {

        short counter = 0;
        for (int i=0;i<words.length ; i++) {
            if (words[i].startsWith(pref)) {
                counter += 1;
            }
        }
        return counter;
    }
}
