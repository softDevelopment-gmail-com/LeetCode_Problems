package uz.leetCode.arrays;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    // 11->>> 1,3,5
    //17->>>> 1,3,5,7
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 1; i <= n - 1; i++) {
                stringBuilder.append('a');
            }
            sum += n - 1;
            for (int i = 1; i <= n - sum; i++) {
                stringBuilder.append('b' + (char) (i - 1));
            }
        } else {
            for (int i = 1; i <= n - 2; i++) {
                stringBuilder.append('a');
            }
            sum += n - 1;
            for (int i = 1; i <= n - sum; i++) {
                stringBuilder.append('b' + (char) (i - 1));
            }
        }
        return stringBuilder.toString();
    }
}
