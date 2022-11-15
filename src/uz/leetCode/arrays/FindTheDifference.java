package uz.leetCode.arrays;


public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (!s.contains(t.substring(i,i+1))) {
                return t.charAt(i);
            }
        }
        return t.charAt(0);
    }
}