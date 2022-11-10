package uz.leetCode.arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] array1 = {"ab", "c"};
        String[] array2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(array1, array2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (String s : word1) {
            stringBuilder1.append(s);
        }
        for (String s : word2) {
            stringBuilder2.append(s);
        }

        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
