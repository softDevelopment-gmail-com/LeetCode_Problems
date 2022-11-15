package uz.leetCode.arrays;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        } else
            return word.charAt(0) == (Character.toUpperCase(word.charAt(0))) && word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
