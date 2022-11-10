package uz.leetCode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfSentenceIsPangram {
    public static void main(String[] args) {
        //"thequickbrownfoxjumpsoverthelazydog"
        //"leetcode"
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        int sum=0;
        char [] chars=sentence.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i]!=chars[i+1]){
                sum+=chars[i];
            }
        }
        sum+=chars[chars.length-1];
        return 2847==sum;
    }
}
