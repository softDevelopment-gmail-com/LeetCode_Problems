package uz.leetCode.arrays;

public class ThreeDivisors {

    public boolean isThree(int n) {
        if (n < 4) {
            return false;
        }
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter == 3;
    }
}
