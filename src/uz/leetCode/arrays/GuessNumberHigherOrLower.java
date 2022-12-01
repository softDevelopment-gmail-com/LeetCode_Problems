package uz.leetCode.arrays;

import java.util.Random;

public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println(guessNumber(20));
    }

    public static int guessNumber(int n) {
        int check=2;
        while (check != 0) {
            check = guess(n);
            if (check == 1) {
                guess(n /= 2);
            } else if (check == -1) {
                guess(n *= 2);
            }
        }
        return n;
    }

    public static int guess(int num) {
        return new Random().nextInt() * num;
    }
}
