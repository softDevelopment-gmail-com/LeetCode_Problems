package uz.leetCode.arrays;

public class MakingTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s) {

        if (s.length() == 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();

        for (String s1 : s.split("")) {
            if (Character.isUpperCase(s1.charAt(0))) {
                str.append(s1);
                str.append(s1.toLowerCase());
                if (s.contains(str) || s.contains(str.reverse())) {
                    s = s.replace(str, "");
                }
            } else {
                str.append(s1);
                str.append(s1.toUpperCase());
                if (s.contains(str) || s.contains(str.reverse())) {
                    s = s.replace(str, "");
                }
            }
            str = new StringBuilder();
        }

        return s;

    }
}
