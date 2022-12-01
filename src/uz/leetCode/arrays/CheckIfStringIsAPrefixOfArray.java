package uz.leetCode.arrays;

public class CheckIfStringIsAPrefixOfArray {

    public static void main(String[] args) {
        String[] str = {"aa", "aaaa", "banana"};
        System.out.println(isPrefixString("a", str));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < words.length; i++) {
            if (stringBuilder.indexOf(words[i]) == 0) {
                stringBuilder.replace(0, words[i].length(), "");
                if (stringBuilder.length() == 0) {
                    return true;
                } else if (i == words.length - 1 && stringBuilder.length() > 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
