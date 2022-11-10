package uz.leetCode.arrays;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            stringBuilder.append(words[i]);
            if (i != k - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
