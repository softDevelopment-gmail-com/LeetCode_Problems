package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KeyBoardRow {
    public static void main(String[] args) {
        String[] array = {"asdfghjklASDFGHJKL", "qwertyuiopQWERTYUIOP", "zxcvbnmZXCVBNM"};
        System.out.println(Arrays.toString(findWords(array)));
    }

    public static String[] findWords(String[] words) {
        final String[] str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new LinkedList<>();
        String givenList;
        short counter = 0;
        List<String> wordList = new LinkedList<>();


        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (i != word.length() - 1) {
                    wordList.add(word.substring(i, i + 1).toLowerCase());
                } else {
                    wordList.add(word.substring(i).toLowerCase());
                }
            }
            for (int j = 0; j < 3; j++) {
                givenList = str[counter];
                for (int i = 0; i < wordList.size(); i++) {
                    if (givenList.contains(wordList.get(i))) {
                        if (i == wordList.size() - 1) {
                            list.add(word);
                        }
                    } else {
                        break;
                    }
                }
                counter+=1;

            }
            wordList.clear();
            counter =0;
        }

        String[] strings = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i);
        }
        return strings;
    }


}
