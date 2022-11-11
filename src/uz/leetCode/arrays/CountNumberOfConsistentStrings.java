package uz.leetCode.arrays;

public class CountNumberOfConsistentStrings {
    public static void main(String[] args) {
        String[] strings = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings("ab", strings));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        char c = ' ';
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!allowed.contains(word.subSequence(i, i + 1))) {
                    if (i == word.length() - 1) {
                        counter++;
                    }
                    break;
                }
            }
        }
        return counter;
    }

    public static int countConsistentStrings_1(String allowed, String[] words) {
        int count = 0;
        for (String str : words) {
            String s = str;
            int cek = 0;
            for (int j = 0; j < s.length(); j++) {
                if (allowed.contains(String.valueOf(s.charAt(j)))) {
                    cek++;
                }
            }
            if (cek == s.length()) {
                count++;
            }
        }
        return count;
    }

}
