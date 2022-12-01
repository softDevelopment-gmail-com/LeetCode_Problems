package uz.leetCode.arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        //"abc"
        //"acb""aaaaaa"
        //"bbaaaa"
        System.out.println(isSubsequence("aaaaaa",
                "bbaaaa"));
    }

    public static boolean isSubsequence(String s, String t) {
        int index;
        for (int i = 0; i < s.length(); i++) {
            index = t.indexOf(s.charAt(i));
            if (index != -1) {
                s = s.substring(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
