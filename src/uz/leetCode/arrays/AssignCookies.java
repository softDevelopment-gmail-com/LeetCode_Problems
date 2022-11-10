package uz.leetCode.arrays;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] s = {1,2,3};
        int[] g = {1, 1};
        System.out.println(findContentChildren(s, g));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int counter = 0;
        short num=0;
        for (int i : g) {
            for (int greed = num; greed < s.length; greed++) {
                if (s[greed] != 0 && i <= s[greed]) {
                    counter++;
                    s[greed] = 0;
                    break;
                }
                num+=1;
            }
        }
        return counter;
    }
}
