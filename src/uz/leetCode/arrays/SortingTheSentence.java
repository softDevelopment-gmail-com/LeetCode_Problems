package uz.leetCode.arrays;


import java.util.Arrays;

public class SortingTheSentence {

    public String sortSentence(String s) {
        String[] strings = s.split(" ");
        int[] positions = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            positions[i] = Integer.parseInt(String.valueOf(strings[i].charAt(strings[i].length() - 1)));
        }
        StringBuilder str = new StringBuilder();
        Arrays.sort(positions);
        for (int i = 0; i < strings.length; i++) {
            str.append(strings[positions[i]], 0, strings[positions[i]].length()-1);
            str.append(" ");
        }
        return str.toString().trim();
    }

}
